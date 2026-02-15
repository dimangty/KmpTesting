package com.example.kursovikkmp.feature.auth.pin

import app.cash.turbine.test
import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.auth.AuthError
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
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
class PinViewModelTest {

    private lateinit var viewModel: PinViewModel
    private lateinit var authService: AuthServiceFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        authService = AuthServiceFake()
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

        viewModel = PinViewModel(authService)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for PinChanged Event ====================

    @Test
    fun pinChanged_whenValidPin_updatesPinValue() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertEquals(validPin, viewModel.state.pin)
    }

    @Test
    fun pinChanged_whenValidPin_updatesPinFieldState() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertEquals(validPin, viewModel.state.pinFieldState.value)
    }

    @Test
    fun pinChanged_whenValidPin_isPinValidIsTrue() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertTrue(viewModel.state.isPinValid)
    }

    @Test
    fun pinChanged_whenValidPin_errorMessageIsNull() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertNull(viewModel.state.errorMessage)
    }

    @Test
    fun pinChanged_whenValidPin_errorTextStateIsNull() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertNull(viewModel.state.errorTextState)
    }

    @Test
    fun pinChanged_whenValidPin_confirmButtonIsEnabled() = runTest {
        // Given
        val validPin = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // Then
        assertTrue(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun pinChanged_whenInvalidPin_updatesPinValue() = runTest {
        // Given
        val invalidPin = "123"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(invalidPin))

        // Then
        assertEquals(invalidPin, viewModel.state.pin)
    }

    @Test
    fun pinChanged_whenInvalidPin_updatesPinFieldState() = runTest {
        // Given
        val invalidPin = "123"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(invalidPin))

        // Then
        assertEquals(invalidPin, viewModel.state.pinFieldState.value)
    }

    @Test
    fun pinChanged_whenInvalidPin_isPinValidIsFalse() = runTest {
        // Given
        val invalidPin = "123"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(invalidPin))

        // Then
        assertFalse(viewModel.state.isPinValid)
    }

    @Test
    fun pinChanged_whenInvalidPin_confirmButtonIsDisabled() = runTest {
        // Given
        val invalidPin = "123"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(invalidPin))

        // Then
        assertFalse(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun pinChanged_whenPinContainsNonDigits_filtersPinToDigitsOnly() = runTest {
        // Given
        val pinWithNonDigits = "12a34b56"
        val expectedDigits = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(pinWithNonDigits))

        // Then
        assertEquals(expectedDigits, viewModel.state.pin)
    }

    @Test
    fun pinChanged_whenPinContainsNonDigits_filtersPinFieldStateToDigitsOnly() = runTest {
        // Given
        val pinWithNonDigits = "12a34b56"
        val expectedDigits = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(pinWithNonDigits))

        // Then
        assertEquals(expectedDigits, viewModel.state.pinFieldState.value)
    }

    @Test
    fun pinChanged_whenPinExceeds6Digits_truncatesPinTo6Digits() = runTest {
        // Given
        val longPin = "123456789"
        val expected6Digits = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(longPin))

        // Then
        assertEquals(expected6Digits, viewModel.state.pin)
    }

    @Test
    fun pinChanged_whenPinExceeds6Digits_truncatesPinFieldStateTo6Digits() = runTest {
        // Given
        val longPin = "123456789"
        val expected6Digits = "123456"

        // When
        viewModel.pushEvent(PinEvents.PinChanged(longPin))

        // Then
        assertEquals(expected6Digits, viewModel.state.pinFieldState.value)
    }

    @Test
    fun pinChanged_whenPinIsEmpty_pinValueIsEmpty() = runTest {
        // Given
        val emptyPin = ""

        // When
        viewModel.pushEvent(PinEvents.PinChanged(emptyPin))

        // Then
        assertEquals(emptyPin, viewModel.state.pin)
    }

    @Test
    fun pinChanged_whenPinIsEmpty_pinFieldStateIsEmpty() = runTest {
        // Given
        val emptyPin = ""

        // When
        viewModel.pushEvent(PinEvents.PinChanged(emptyPin))

        // Then
        assertEquals(emptyPin, viewModel.state.pinFieldState.value)
    }

    @Test
    fun pinChanged_whenPinIsEmpty_isPinValidIsFalse() = runTest {
        // Given
        val emptyPin = ""

        // When
        viewModel.pushEvent(PinEvents.PinChanged(emptyPin))

        // Then
        assertFalse(viewModel.state.isPinValid)
    }

    @Test
    fun pinChanged_whenPinIsEmpty_confirmButtonIsDisabled() = runTest {
        // Given
        val emptyPin = ""

        // When
        viewModel.pushEvent(PinEvents.PinChanged(emptyPin))

        // Then
        assertFalse(viewModel.state.confirmButtonState.isEnabled)
    }

    @Test
    fun pinChanged_afterError_clearsErrorMessage() = runTest {
        // Given - set up error state first
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged("123456"))
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(PinEvents.PinChanged("654321"))

        // Then
        assertNull(viewModel.state.errorMessage)
    }

    @Test
    fun pinChanged_afterError_clearsErrorTextState() = runTest {
        // Given - set up error state first
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged("123456"))
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(PinEvents.PinChanged("654321"))

        // Then
        assertNull(viewModel.state.errorTextState)
    }

    // ==================== Tests for ConfirmTapped Event ====================

    @Test
    fun confirmTapped_whenPinIsValid_callsAuthService() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, authService.verifyPinCallCount)
        assertEquals(validPin, authService.lastVerifyPin)
    }

    @Test
    fun confirmTapped_whenPinIsInvalid_doesNotCallAuthService() = runTest {
        // Given
        val invalidPin = "123"
        viewModel.pushEvent(PinEvents.PinChanged(invalidPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(0, authService.verifyPinCallCount)
    }

    @Test
    fun confirmTapped_whenSuccess_navigatesToMain() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(PinEvents.ConfirmTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateToMain, navigationAction)
        }
    }

    @Test
    fun confirmTapped_whenFails_showsErrorMessage() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
        assertNotNull(state.errorTextState)
        assertFalse(state.isLoading)
    }

    @Test
    fun confirmTapped_whenFails_doesNotNavigate() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(PinEvents.ConfirmTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then - no navigation event should be emitted
            expectNoEvents()
        }
    }

    // ==================== Tests for State Changes ====================

    @Test
    fun state_initialState_hasCorrectDefaults() {
        // Given - viewModel is created in setup

        // Then
        val state = viewModel.state
        assertEquals("", state.pin)
        assertFalse(state.isLoading)
        assertNull(state.errorMessage)
        assertFalse(state.isPinValid)
        assertFalse(state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_whenVerifyStarts_isLoadingBecomesTrue() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state (after pin changed)
            viewModel.pushEvent(PinEvents.ConfirmTapped)

            // Then - loading state is emitted
            val loadingState = awaitItem()
            assertTrue(loadingState.isLoading)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_whenVerifyStarts_buttonBecomesDisabled() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state (after pin changed)
            viewModel.pushEvent(PinEvents.ConfirmTapped)

            // Then - button is disabled during loading
            val loadingState = awaitItem()
            assertFalse(loadingState.confirmButtonState.isEnabled)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_afterSuccessfulVerify_isLoadingIsFalse() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterSuccessfulVerify_buttonIsEnabled() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertTrue(state.confirmButtonState.isEnabled)
    }

    @Test
    fun state_afterSuccessfulVerify_errorMessageIsNull() = runTest {
        // Given
        val validPin = "123456"
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNull(state.errorMessage)
    }

    @Test
    fun state_afterFailedVerify_isLoadingIsFalse() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterFailedVerify_errorMessageIsSet() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
    }

    @Test
    fun state_afterFailedVerify_errorTextStateIsSet() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorTextState)
    }

    @Test
    fun state_afterFailedVerify_buttonIsEnabled() = runTest {
        // Given
        val validPin = "123456"
        authService.shouldFail = true
        viewModel.pushEvent(PinEvents.PinChanged(validPin))

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertTrue(state.confirmButtonState.isEnabled)
    }

    // ==================== Tests for Flow Testing with Turbine ====================

    @Test
    fun stateFlow_onPinChange_emitsUpdatedPin() = runTest {
        // Given
        viewModel.stateFlow.test {
            skipItems(1) // Skip initial state

            // When
            viewModel.pushEvent(PinEvents.PinChanged("123456"))

            // Then
            val updatedState = awaitItem()
            assertEquals("123456", updatedState.pin)
        }
    }

    @Test
    fun stateFlow_onPinChange_emitsUpdatedValidationState() = runTest {
        // Given
        viewModel.stateFlow.test {
            skipItems(1) // Skip initial state

            // When
            viewModel.pushEvent(PinEvents.PinChanged("123456"))

            // Then
            val updatedState = awaitItem()
            assertTrue(updatedState.isPinValid)
        }
    }

    @Test
    fun stateFlow_afterVerify_emitsNotLoadingState() = runTest {
        // Given
        viewModel.pushEvent(PinEvents.PinChanged("123456"))
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(PinEvents.ConfirmTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertFalse(viewModel.state.isLoading)
    }

    @Test
    fun navigationFlow_onSuccessfulVerify_emitsNavigateToMain() = runTest {
        // Given
        viewModel.pushEvent(PinEvents.PinChanged("123456"))

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(PinEvents.ConfirmTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            assertEquals(NavigationAction.NavigateToMain, awaitItem())
        }
    }

    // ==================== Mock Implementations ====================

    private class AuthServiceFake : AuthService {
        var verifyPinCallCount = 0
        var lastVerifyPin: String? = null
        var shouldFail = false

        override suspend fun login(phone: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun signUp(data: SignUpData): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun verifyPin(pin: String): Result<Unit> {
            verifyPinCallCount++
            lastVerifyPin = pin
            return if (shouldFail) {
                Result.failure(AuthError.InvalidData)
            } else {
                Result.success(Unit)
            }
        }

        override suspend fun logout() {
            // No-op
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

        override fun isIOS(): Boolean = true

        override fun openMailToSupport(mail: String) {
            // No-op for testing
        }

        override fun openUrl(urlString: String) {
            // No-op for testing
        }
    }
}
