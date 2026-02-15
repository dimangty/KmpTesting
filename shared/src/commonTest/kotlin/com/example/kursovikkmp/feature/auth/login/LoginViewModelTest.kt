package com.example.kursovikkmp.feature.auth.login

import app.cash.turbine.test
import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.auth.AuthError
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
import com.example.kursovikkmp.feature.auth.ValidationService
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class LoginViewModelTest {

    private lateinit var viewModel: LoginViewModel
    private lateinit var authService: AuthServiceFake
    private lateinit var validationService: ValidationServiceFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        authService = AuthServiceFake()
        validationService = ValidationServiceFake()
        navigationService = NavigationServiceFake()

        // Start Koin with test module
        startKoin {
            modules(
                module {
                    single<NavigationService> { navigationService }
                    single<ResourceService> { ResourceServiceFake() }
                    single<DeviceService> { DeviceServiceFake() }
                    factory { LceStateManager() }
                }
            )
        }

        viewModel = LoginViewModel(authService, validationService)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for PhoneChanged Event ====================

    @Test
    fun phoneChanged_whenValidPhone_updatesPhoneValue() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertEquals(validPhone, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_whenValidPhone_updatesPhoneFieldState() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertEquals(validPhone, viewModel.state.phoneFieldState.value)
    }

    @Test
    fun phoneChanged_whenValidPhone_isPhoneValidIsTrue() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertTrue(viewModel.state.isPhoneValid)
    }

    @Test
    fun phoneChanged_whenValidPhone_errorMessageIsNull() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertNull(viewModel.state.errorMessage)
    }

    @Test
    fun phoneChanged_whenValidPhone_errorTextStateIsNull() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertNull(viewModel.state.errorTextState)
    }

    @Test
    fun phoneChanged_whenValidPhone_confirmButtonIsEnabled() = runTest {
        // Given
        val validPhone = "1234567890"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // Then
        assertTrue(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun phoneChanged_whenInvalidPhone_updatesPhoneValue() = runTest {
        // Given
        val invalidPhone = "123"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(invalidPhone))

        // Then
        assertEquals(invalidPhone, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_whenInvalidPhone_updatesPhoneFieldState() = runTest {
        // Given
        val invalidPhone = "123"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(invalidPhone))

        // Then
        assertEquals(invalidPhone, viewModel.state.phoneFieldState.value)
    }

    @Test
    fun phoneChanged_whenInvalidPhone_isPhoneValidIsFalse() = runTest {
        // Given
        val invalidPhone = "123"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(invalidPhone))

        // Then
        assertFalse(viewModel.state.isPhoneValid)
    }

    @Test
    fun phoneChanged_whenInvalidPhone_confirmButtonIsDisabled() = runTest {
        // Given
        val invalidPhone = "123"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(invalidPhone))

        // Then
        assertFalse(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun phoneChanged_whenPhoneContainsNonDigits_filtersPhoneToDigitsOnly() = runTest {
        // Given
        val phoneWithNonDigits = "+1 (234) 567-8901"
        val expectedDigits = "12345678901"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(phoneWithNonDigits))

        // Then
        assertEquals(expectedDigits, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_whenPhoneContainsNonDigits_filtersPhoneFieldStateToDigitsOnly() = runTest {
        // Given
        val phoneWithNonDigits = "+1 (234) 567-8901"
        val expectedDigits = "12345678901"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(phoneWithNonDigits))

        // Then
        assertEquals(expectedDigits, viewModel.state.phoneFieldState.value)
    }

    @Test
    fun phoneChanged_whenPhoneExceeds15Digits_truncatesPhoneTo15Digits() = runTest {
        // Given
        val longPhone = "1234567890123456789"
        val expected15Digits = "123456789012345"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(longPhone))

        // Then
        assertEquals(expected15Digits, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_whenPhoneExceeds15Digits_truncatesPhoneFieldStateTo15Digits() = runTest {
        // Given
        val longPhone = "1234567890123456789"
        val expected15Digits = "123456789012345"

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(longPhone))

        // Then
        assertEquals(expected15Digits, viewModel.state.phoneFieldState.value)
    }

    @Test
    fun phoneChanged_whenPhoneIsEmpty_phoneValueIsEmpty() = runTest {
        // Given
        val emptyPhone = ""

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(emptyPhone))

        // Then
        assertEquals(emptyPhone, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_whenPhoneIsEmpty_phoneFieldStateIsEmpty() = runTest {
        // Given
        val emptyPhone = ""

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(emptyPhone))

        // Then
        assertEquals(emptyPhone, viewModel.state.phoneFieldState.value)
    }

    @Test
    fun phoneChanged_whenPhoneIsEmpty_isPhoneValidIsFalse() = runTest {
        // Given
        val emptyPhone = ""

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(emptyPhone))

        // Then
        assertFalse(viewModel.state.isPhoneValid)
    }

    @Test
    fun phoneChanged_whenPhoneIsEmpty_confirmButtonIsDisabled() = runTest {
        // Given
        val emptyPhone = ""

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged(emptyPhone))

        // Then
        assertFalse(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun phoneChanged_afterError_clearsErrorMessage() = runTest {
        // Given - set up error state first
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged("0987654321"))

        // Then
        assertNull(viewModel.state.errorMessage)
    }

    @Test
    fun phoneChanged_afterError_clearsErrorTextState() = runTest {
        // Given - set up error state first
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(LoginEvents.PhoneChanged("0987654321"))

        // Then
        assertNull(viewModel.state.errorTextState)
    }

    // ==================== Tests for LoginButtonTapped Event ====================

    @Test
    fun loginButtonTapped_whenPhoneIsValid_callsAuthService() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, authService.loginCallCount)
        assertEquals(validPhone, authService.lastLoginPhone)
    }

    @Test
    fun loginButtonTapped_whenPhoneIsInvalid_doesNotCallAuthService() = runTest {
        // Given
        val invalidPhone = "123"
        viewModel.pushEvent(LoginEvents.PhoneChanged(invalidPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(0, authService.loginCallCount)
    }

    @Test
    fun loginButtonTapped_whenSuccess_navigatesToPin() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(LoginEvents.LoginButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateToPin, navigationAction)
        }
    }

    @Test
    fun loginButtonTapped_whenFails_showsErrorMessage() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
        assertEquals("Invalid phone number", state.errorMessage)
        assertNotNull(state.errorTextState)
        assertFalse(state.isLoading)
    }

    @Test
    fun loginButtonTapped_whenFails_doesNotNavigate() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(LoginEvents.LoginButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then - no navigation event should be emitted
            expectNoEvents()
        }
    }

    // ==================== Tests for SignUpButtonTapped Event ====================

    @Test
    fun signUpButtonTapped_navigatesToSignUp() = runTest {
        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(LoginEvents.SignUpButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateToSignUp, navigationAction)
        }
    }

    // ==================== Tests for State Changes ====================

    @Test
    fun state_initialState_hasCorrectDefaults() {
        // Given - viewModel is created in setup

        // Then
        val state = viewModel.state
        assertEquals("", state.phone)
        assertFalse(state.isLoading)
        assertNull(state.errorMessage)
        assertFalse(state.isPhoneValid)
        assertFalse(state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_whenLoginStarts_isLoadingBecomesTrue() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state (after phone changed)
            viewModel.pushEvent(LoginEvents.LoginButtonTapped)

            // Then - loading state is emitted
            val loadingState = awaitItem()
            assertTrue(loadingState.isLoading)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_whenLoginStarts_buttonBecomesDisabled() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state (after phone changed)
            viewModel.pushEvent(LoginEvents.LoginButtonTapped)

            // Then - button is disabled during loading
            val loadingState = awaitItem()
            assertFalse(loadingState.confirmButtonState.isEnabled)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_afterSuccessfulLogin_isLoadingIsFalse() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterSuccessfulLogin_buttonIsEnabled() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertTrue(state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_afterSuccessfulLogin_errorMessageIsNull() = runTest {
        // Given
        val validPhone = "1234567890"
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNull(state.errorMessage)
    }

    @Test
    fun state_afterFailedLogin_isLoadingIsFalse() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterFailedLogin_errorMessageIsSet() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
        assertEquals("Invalid phone number", state.errorMessage)
    }

    @Test
    fun state_afterFailedLogin_errorTextStateIsSet() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorTextState)
    }

    @Test
    fun state_afterFailedLogin_buttonIsEnabled() = runTest {
        // Given
        val validPhone = "1234567890"
        authService.shouldFail = true
        validationService.isPhoneValidResult = true
        viewModel.pushEvent(LoginEvents.PhoneChanged(validPhone))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertTrue(state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_buttonEnabled_whenPhoneIsInvalid_buttonDisabled() = runTest {
        // Given - invalid phone
        viewModel.pushEvent(LoginEvents.PhoneChanged("123"))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertFalse(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_buttonEnabled_whenPhoneIsValid_buttonEnabled() = runTest {
        // Given
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertTrue(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_buttonEnabled_afterSuccessfulLogin_buttonEnabled() = runTest {
        // Given
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertTrue(viewModel.state.confirmButtonState.isEnabled)
        assertFalse(viewModel.state.isLoading)
    }

    // ==================== Tests for Flow Testing with Turbine ====================

    @Test
    fun stateFlow_onPhoneChange_emitsUpdatedPhone() = runTest {
        // Given
        viewModel.stateFlow.test {
            skipItems(1) // Skip initial state

            // When
            viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))

            // Then
            val updatedState = awaitItem()
            assertEquals("1234567890", updatedState.phone)
        }
    }

    @Test
    fun stateFlow_onPhoneChange_emitsUpdatedValidationState() = runTest {
        // Given
        viewModel.stateFlow.test {
            skipItems(1) // Skip initial state

            // When
            viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))

            // Then
            val updatedState = awaitItem()
            assertTrue(updatedState.isPhoneValid)
        }
    }

    @Test
    fun stateFlow_afterLogin_emitsNotLoadingState() = runTest {
        // Given
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(LoginEvents.LoginButtonTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertFalse(viewModel.state.isLoading)
    }

    @Test
    fun navigationFlow_onSignUpButtonTapped_emitsNavigateToSignUp() = runTest {
        // Given
        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(LoginEvents.SignUpButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            assertEquals(NavigationAction.NavigateToSignUp, awaitItem())
        }
    }

    @Test
    fun navigationFlow_onSuccessfulLogin_emitsNavigateToPin() = runTest {
        // Given
        viewModel.pushEvent(LoginEvents.PhoneChanged("1234567890"))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(LoginEvents.LoginButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            assertEquals(NavigationAction.NavigateToPin, awaitItem())
        }
    }

    // ==================== Mock Implementations ====================

    private class AuthServiceFake : AuthService {
        var loginCallCount = 0
        var lastLoginPhone: String? = null
        var shouldFail = false

        override suspend fun login(phone: String): Result<Unit> {
            loginCallCount++
            lastLoginPhone = phone
            return if (shouldFail) {
                Result.failure(AuthError.InvalidPhone)
            } else {
                Result.success(Unit)
            }
        }

        override suspend fun signUp(data: SignUpData): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun verifyPin(pin: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun logout() {
            // No-op
        }
    }

    private class ValidationServiceFake : ValidationService {
        var isPhoneValidResult = false

        override fun isPhoneValid(phone: String): Boolean {
            // Default behavior - valid if length is between 7 and 15
            if (isPhoneValidResult) return true
            val digitsOnly = phone.filter { it.isDigit() }
            return digitsOnly.length in 7..15
        }

        override fun isEmailValid(email: String): Boolean {
            return true
        }

        override fun isNameValid(name: String): Boolean {
            return true
        }
    }

    private class NavigationServiceFake : NavigationService {
        private val _currentDestination = MutableStateFlow("")
        override val currentDestination: StateFlow<String> = _currentDestination

        val navigationActions = mutableListOf<NavigationAction>()

        override fun navigate(action: NavigationAction) {
            navigationActions.add(action)
        }

        override fun navigateBack() {
            navigationActions.add(NavigationAction.NavigateBack)
        }

        override fun <T> setPreviousBackStackEntry(key: String, value: T) {
            // No-op for testing
        }

        override fun <T> getCurrentBackStackEntry(key: String): T? {
            return null
        }

        override fun <T> clearCurrentBackStackEntry(key: String) {
            // No-op for testing
        }
    }

    private class ResourceServiceFake : ResourceService {
        override fun getString(stringRes: StringResource): String {
            return "Test String"
        }

        override fun getString(stringRes: StringResource, args: List<String>): String {
            return "Test String with args"
        }
    }

    private class DeviceServiceFake : DeviceService {
        override fun isAndroid(): Boolean = false

        override fun isIOS(): Boolean = true // Return true for testing navigation flow

        override fun openMailToSupport(mail: String) {
            // No-op for testing
        }

        override fun openUrl(urlString: String) {
            // No-op for testing
        }
    }
}
