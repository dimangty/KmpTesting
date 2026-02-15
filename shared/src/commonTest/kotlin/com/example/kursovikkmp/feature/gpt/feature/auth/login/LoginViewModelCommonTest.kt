package com.example.kursovikkmp.gpt.feature.auth.login

import app.cash.turbine.test
import com.example.kursovikkmp.MR
import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
import com.example.kursovikkmp.feature.auth.ValidationService
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module

@OptIn(ExperimentalCoroutinesApi::class)
class LoginViewModelCommonTest {

    private val dispatcher = StandardTestDispatcher()

    private lateinit var authService: com.example.kursovikkmp.gpt.feature.auth.login.FakeAuthService
    private lateinit var validationService: com.example.kursovikkmp.gpt.feature.auth.login.FakeValidationService
    private lateinit var navigationService: com.example.kursovikkmp.gpt.feature.auth.login.FakeNavigationService
    private lateinit var resourceService: com.example.kursovikkmp.gpt.feature.auth.login.FakeResourceService
    private lateinit var deviceService: com.example.kursovikkmp.gpt.feature.auth.login.FakeDeviceService

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(dispatcher)
        authService =
            com.example.kursovikkmp.gpt.feature.auth.login.FakeAuthService()
        validationService =
            com.example.kursovikkmp.gpt.feature.auth.login.FakeValidationService()
        navigationService =
            com.example.kursovikkmp.gpt.feature.auth.login.FakeNavigationService()
        resourceService =
            com.example.kursovikkmp.gpt.feature.auth.login.FakeResourceService()
        deviceService =
            com.example.kursovikkmp.gpt.feature.auth.login.FakeDeviceService()

        startKoin {
            modules(
                module {
                    single<NavigationService> { navigationService }
                    single<ResourceService> { resourceService }
                    single<DeviceService> { deviceService }
                    factory { LceStateManager() }
                }
            )
        }
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
        Dispatchers.resetMain()
    }

    @Test
    fun pushEvent_emitsEventToEventsFlow() = runTest {
        // Given
        val viewModel = createViewModel()
        val event = com.example.kursovikkmp.feature.auth.login.LoginEvents.PhoneChanged("+1 (234) abc")

        viewModel.events.test {
            // When
            viewModel.pushEvent(event)

            // Then
            assertEquals(event, awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun phoneChanged_updatesStateWithFilteredPhoneAndEnabledButton() = runTest {
        // Given
        val viewModel = createViewModel()

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.PhoneChanged("+1 (234) abc 567890"))
            val updated = awaitItem()

            // Then
            assertEquals("1234567890", updated.phone)
            assertEquals("1234567890", updated.phoneFieldState.value)
            assertTrue(updated.isPhoneValid)
            assertTrue(updated.confirmButtonState.isEnabled)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun phoneChanged_withInvalidPhone_disablesConfirmButton() = runTest {
        // Given
        val viewModel = createViewModel()

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.PhoneChanged("12ab"))
            val updated = awaitItem()

            // Then
            assertEquals("12", updated.phone)
            assertFalse(updated.isPhoneValid)
            assertFalse(updated.confirmButtonState.isEnabled)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun signUpButtonTapped_emitsNavigateToSignUp() = runTest {
        // Given
        val viewModel = createViewModel()

        navigationService.actions.test {
            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.SignUpButtonTapped)

            // Then
            assertEquals(NavigationAction.NavigateToSignUp, awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun loginButtonTapped_withValidPhone_setsLoadingThenNavigatesToPin() = runTest {
        // Given
        val viewModel = createViewModel()
        authService.loginGate = CompletableDeferred()

        viewModel.flowState.test {
            awaitItem()
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.PhoneChanged("1234567"))
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.LoginButtonTapped)
            val loadingState = awaitItem()

            // Then
            assertTrue(loadingState.isLoading)
            assertFalse(loadingState.confirmButtonState.isEnabled)

            authService.loginGate?.complete(Unit)
            advanceUntilIdle()
            val successState = awaitItem()
            assertFalse(successState.isLoading)
            assertNull(successState.errorMessage)
            assertTrue(successState.confirmButtonState.isEnabled)

            cancelAndIgnoreRemainingEvents()
        }

        assertEquals(listOf("1234567"), authService.loginPhones)
        assertTrue(navigationService.recordedActions.contains(NavigationAction.NavigateToPin))
    }

    @Test
    fun loginButtonTapped_whenAuthFails_updatesErrorAndDoesNotNavigate() = runTest {
        // Given
        val viewModel = createViewModel()
        authService.loginResult = Result.failure(IllegalArgumentException("error"))

        viewModel.flowState.test {
            awaitItem()
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.PhoneChanged("1234567"))
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.login.LoginEvents.LoginButtonTapped)
            awaitItem()
            val failedState = awaitItem()

            // Then
            assertFalse(failedState.isLoading)
            assertEquals("Invalid phone number", failedState.errorMessage)
            assertEquals("Invalid phone number", failedState.errorTextState?.value)
            assertTrue(failedState.confirmButtonState.isEnabled)
            cancelAndIgnoreRemainingEvents()
        }

        assertTrue(navigationService.recordedActions.isEmpty())
    }

    private fun createViewModel(): com.example.kursovikkmp.feature.auth.login.LoginViewModel {
        return com.example.kursovikkmp.feature.auth.login.LoginViewModel(
            authService = authService,
            validationService = validationService
        )
    }
}

private class FakeAuthService : AuthService {
    var loginResult: Result<Unit> = Result.success(Unit)
    var loginGate: CompletableDeferred<Unit>? = null
    val loginPhones = mutableListOf<String>()

    override suspend fun login(phone: String): Result<Unit> {
        loginPhones += phone
        loginGate?.await()
        return loginResult
    }

    override suspend fun signUp(data: SignUpData): Result<Unit> = Result.success(Unit)

    override suspend fun verifyPin(pin: String): Result<Unit> = Result.success(Unit)

    override suspend fun logout() = Unit
}

private class FakeValidationService : ValidationService {
    override fun isPhoneValid(phone: String): Boolean = phone.length in 7..15

    override fun isEmailValid(email: String): Boolean = true

    override fun isNameValid(name: String): Boolean = true
}

private class FakeNavigationService : NavigationService {
    private val _currentDestination = MutableStateFlow("")
    private val _actions = MutableSharedFlow<NavigationAction>(extraBufferCapacity = 8)

    val actions = _actions.asSharedFlow()
    val recordedActions = mutableListOf<NavigationAction>()

    override val currentDestination: StateFlow<String> = _currentDestination

    override fun navigate(action: NavigationAction) {
        recordedActions += action
        _actions.tryEmit(action)
    }

    override fun navigateBack() {
        recordedActions += NavigationAction.NavigateBack
        _actions.tryEmit(NavigationAction.NavigateBack)
    }

    override fun <T> setPreviousBackStackEntry(key: String, value: T) = Unit

    override fun <T> getCurrentBackStackEntry(key: String): T? = null

    override fun <T> clearCurrentBackStackEntry(key: String) = Unit
}

private class FakeResourceService : ResourceService {
    override fun getString(stringRes: StringResource): String {
        return when (stringRes) {
            MR.strings.phone_number -> "Phone number"
            MR.strings.confirm -> "Confirm"
            MR.strings.sign_up -> "Sign Up"
            else -> "value"
        }
    }

    override fun getString(stringRes: StringResource, args: List<String>): String {
        return getString(stringRes)
    }
}

private class FakeDeviceService : DeviceService {
    override fun isAndroid(): Boolean = true

    override fun isIOS(): Boolean = false

    override fun openMailToSupport(mail: String) = Unit

    override fun openUrl(urlString: String) = Unit
}
