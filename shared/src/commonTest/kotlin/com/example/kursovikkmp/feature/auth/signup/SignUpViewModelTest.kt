package com.example.kursovikkmp.feature.auth.signup

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
class SignUpViewModelTest {

    private lateinit var viewModel: SignUpViewModel
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

        viewModel = SignUpViewModel(authService, validationService)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for FirstNameChanged Event ====================

    @Test
    fun firstNameChanged_updatesFirstNameValue() = runTest {
        // Given
        val firstName = "John"

        // When
        viewModel.pushEvent(SignUpEvents.FirstNameChanged(firstName))

        // Then
        assertEquals(firstName, viewModel.state.firstName)
    }

    @Test
    fun firstNameChanged_updatesFirstNameField() = runTest {
        // Given
        val firstName = "John"

        // When
        viewModel.pushEvent(SignUpEvents.FirstNameChanged(firstName))

        // Then
        assertEquals(firstName, viewModel.state.firstNameField.value)
    }

    @Test
    fun firstNameChanged_clearsErrorMessage() = runTest {
        // Given - set up error state first
        authService.shouldFail = true
        fillValidForm()
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(SignUpEvents.FirstNameChanged("Jane"))

        // Then
        assertNull(viewModel.state.errorMessage)
    }

    // ==================== Tests for LastNameChanged Event ====================

    @Test
    fun lastNameChanged_updatesLastNameValue() = runTest {
        // Given
        val lastName = "Doe"

        // When
        viewModel.pushEvent(SignUpEvents.LastNameChanged(lastName))

        // Then
        assertEquals(lastName, viewModel.state.lastName)
    }

    @Test
    fun lastNameChanged_updatesLastNameField() = runTest {
        // Given
        val lastName = "Doe"

        // When
        viewModel.pushEvent(SignUpEvents.LastNameChanged(lastName))

        // Then
        assertEquals(lastName, viewModel.state.lastNameField.value)
    }

    // ==================== Tests for GenderChanged Event ====================

    @Test
    fun genderChanged_updatesGenderValue() = runTest {
        // Given
        val gender = "Male"

        // When
        viewModel.pushEvent(SignUpEvents.GenderChanged(gender))

        // Then
        assertEquals(gender, viewModel.state.gender)
    }

    @Test
    fun genderChanged_updatesGenderField() = runTest {
        // Given
        val gender = "Male"

        // When
        viewModel.pushEvent(SignUpEvents.GenderChanged(gender))

        // Then
        assertEquals(gender, viewModel.state.genderField.value)
    }

    // ==================== Tests for BirthDateChanged Event ====================

    @Test
    fun birthDateChanged_updatesBirthDateValue() = runTest {
        // Given
        val birthDate = "01/01/2000"

        // When
        viewModel.pushEvent(SignUpEvents.BirthDateChanged(birthDate))

        // Then
        assertEquals(birthDate, viewModel.state.birthDate)
    }

    @Test
    fun birthDateChanged_updatesBirthDateField() = runTest {
        // Given
        val birthDate = "01/01/2000"

        // When
        viewModel.pushEvent(SignUpEvents.BirthDateChanged(birthDate))

        // Then
        assertEquals(birthDate, viewModel.state.birthDateField.value)
    }

    // ==================== Tests for CountryChanged Event ====================

    @Test
    fun countryChanged_updatesCountryValue() = runTest {
        // Given
        val country = "USA"

        // When
        viewModel.pushEvent(SignUpEvents.CountryChanged(country))

        // Then
        assertEquals(country, viewModel.state.country)
    }

    @Test
    fun countryChanged_updatesCountryField() = runTest {
        // Given
        val country = "USA"

        // When
        viewModel.pushEvent(SignUpEvents.CountryChanged(country))

        // Then
        assertEquals(country, viewModel.state.countryField.value)
    }

    // ==================== Tests for CityChanged Event ====================

    @Test
    fun cityChanged_updatesCityValue() = runTest {
        // Given
        val city = "New York"

        // When
        viewModel.pushEvent(SignUpEvents.CityChanged(city))

        // Then
        assertEquals(city, viewModel.state.city)
    }

    @Test
    fun cityChanged_updatesCityField() = runTest {
        // Given
        val city = "New York"

        // When
        viewModel.pushEvent(SignUpEvents.CityChanged(city))

        // Then
        assertEquals(city, viewModel.state.cityField.value)
    }

    // ==================== Tests for EmailChanged Event ====================

    @Test
    fun emailChanged_updatesEmailValue() = runTest {
        // Given
        val email = "test@example.com"

        // When
        viewModel.pushEvent(SignUpEvents.EmailChanged(email))

        // Then
        assertEquals(email, viewModel.state.email)
    }

    @Test
    fun emailChanged_updatesEmailField() = runTest {
        // Given
        val email = "test@example.com"

        // When
        viewModel.pushEvent(SignUpEvents.EmailChanged(email))

        // Then
        assertEquals(email, viewModel.state.emailField.value)
    }

    // ==================== Tests for PhoneChanged Event ====================

    @Test
    fun phoneChanged_updatesPhoneValue() = runTest {
        // Given
        val phone = "1234567890"

        // When
        viewModel.pushEvent(SignUpEvents.PhoneChanged(phone))

        // Then
        assertEquals(phone, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_updatesPhoneField() = runTest {
        // Given
        val phone = "1234567890"

        // When
        viewModel.pushEvent(SignUpEvents.PhoneChanged(phone))

        // Then
        assertEquals(phone, viewModel.state.phoneField.value)
    }

    @Test
    fun phoneChanged_filtersNonDigits() = runTest {
        // Given
        val phoneWithNonDigits = "+1 (234) 567-8901"
        val expectedDigits = "12345678901"

        // When
        viewModel.pushEvent(SignUpEvents.PhoneChanged(phoneWithNonDigits))

        // Then
        assertEquals(expectedDigits, viewModel.state.phone)
    }

    @Test
    fun phoneChanged_truncatesTo15Digits() = runTest {
        // Given
        val longPhone = "1234567890123456789"
        val expected15Digits = "123456789012345"

        // When
        viewModel.pushEvent(SignUpEvents.PhoneChanged(longPhone))

        // Then
        assertEquals(expected15Digits, viewModel.state.phone)
    }

    // ==================== Tests for Form Validation ====================

    @Test
    fun formValidation_whenAllFieldsValid_isFormValidIsTrue() = runTest {
        // When
        fillValidForm()

        // Then
        assertTrue(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenAllFieldsValid_buttonIsEnabled() = runTest {
        // When
        fillValidForm()

        // Then
        assertTrue(viewModel.state.createAccountButton.isEnabled)
    }

    @Test
    fun formValidation_whenFirstNameTooShort_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.FirstNameChanged("J"))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenFirstNameTooShort_buttonIsDisabled() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.FirstNameChanged("J"))

        // Then
        assertFalse(viewModel.state.createAccountButton.isEnabled)
    }

    @Test
    fun formValidation_whenLastNameTooShort_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.LastNameChanged("D"))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenGenderEmpty_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.GenderChanged(""))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenCountryEmpty_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.CountryChanged(""))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenCityEmpty_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.CityChanged(""))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenEmailEmpty_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.EmailChanged(""))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    @Test
    fun formValidation_whenPhoneEmpty_isFormValidIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.PhoneChanged(""))

        // Then
        assertFalse(viewModel.state.isFormValid)
    }

    // ==================== Tests for CreateAccountTapped Event ====================

    @Test
    fun createAccountTapped_whenFormValid_callsAuthService() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, authService.signUpCallCount)
        assertNotNull(authService.lastSignUpData)
        assertEquals("John", authService.lastSignUpData?.firstName)
        assertEquals("Doe", authService.lastSignUpData?.lastName)
        assertEquals("Male", authService.lastSignUpData?.gender)
        assertEquals("USA", authService.lastSignUpData?.country)
        assertEquals("New York", authService.lastSignUpData?.city)
        assertEquals("test@example.com", authService.lastSignUpData?.email)
        assertEquals("1234567890", authService.lastSignUpData?.phone)
    }

    @Test
    fun createAccountTapped_whenFormInvalid_doesNotCallAuthService() = runTest {
        // Given - empty form

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(0, authService.signUpCallCount)
    }

    @Test
    fun createAccountTapped_whenSuccess_navigatesToPin() = runTest {
        // Given
        fillValidForm()

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateToPin, navigationAction)
        }
    }

    @Test
    fun createAccountTapped_whenFails_showsErrorMessage() = runTest {
        // Given
        fillValidForm()
        authService.shouldFail = true

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
        assertNotNull(state.errorTextState)
        assertFalse(state.isLoading)
    }

    @Test
    fun createAccountTapped_whenFails_doesNotNavigate() = runTest {
        // Given
        fillValidForm()
        authService.shouldFail = true

        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then - no navigation event should be emitted
            expectNoEvents()
        }
    }

    // ==================== Tests for BackButtonTapped Event ====================

    @Test
    fun backButtonTapped_navigatesBack() = runTest {
        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(SignUpEvents.BackButtonTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateBack, navigationAction)
        }
    }

    // ==================== Tests for State Changes ====================

    @Test
    fun state_initialState_hasCorrectDefaults() {
        // Given - viewModel is created in setup

        // Then
        val state = viewModel.state
        assertEquals("", state.firstName)
        assertEquals("", state.lastName)
        assertEquals("", state.gender)
        assertEquals("", state.birthDate)
        assertEquals("", state.country)
        assertEquals("", state.city)
        assertEquals("", state.email)
        assertEquals("", state.phone)
        assertFalse(state.isLoading)
        assertNull(state.errorMessage)
        assertFalse(state.isFormValid)
        assertFalse(state.createAccountButton.isEnabled)
    }

    @Test
    fun state_whenSignUpStarts_isLoadingBecomesTrue() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state
            viewModel.pushEvent(SignUpEvents.CreateAccountTapped)

            // Then - loading state is emitted
            val loadingState = awaitItem()
            assertTrue(loadingState.isLoading)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_whenSignUpStarts_buttonBecomesDisabled() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.stateFlow.test {
            awaitItem() // Current state
            viewModel.pushEvent(SignUpEvents.CreateAccountTapped)

            // Then - button is disabled during loading
            val loadingState = awaitItem()
            assertFalse(loadingState.createAccountButton.isEnabled)

            testDispatcher.scheduler.advanceUntilIdle()
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun state_afterSuccessfulSignUp_isLoadingIsFalse() = runTest {
        // Given
        fillValidForm()

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterFailedSignUp_isLoadingIsFalse() = runTest {
        // Given
        fillValidForm()
        authService.shouldFail = true

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertFalse(state.isLoading)
    }

    @Test
    fun state_afterFailedSignUp_errorMessageIsSet() = runTest {
        // Given
        fillValidForm()
        authService.shouldFail = true

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorMessage)
    }

    @Test
    fun state_afterFailedSignUp_errorTextStateIsSet() = runTest {
        // Given
        fillValidForm()
        authService.shouldFail = true

        // When
        viewModel.pushEvent(SignUpEvents.CreateAccountTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertNotNull(state.errorTextState)
    }

    // ==================== Helper Methods ====================

    private fun fillValidForm() {
        viewModel.pushEvent(SignUpEvents.FirstNameChanged("John"))
        viewModel.pushEvent(SignUpEvents.LastNameChanged("Doe"))
        viewModel.pushEvent(SignUpEvents.GenderChanged("Male"))
        viewModel.pushEvent(SignUpEvents.BirthDateChanged("01/01/2000"))
        viewModel.pushEvent(SignUpEvents.CountryChanged("USA"))
        viewModel.pushEvent(SignUpEvents.CityChanged("New York"))
        viewModel.pushEvent(SignUpEvents.EmailChanged("test@example.com"))
        viewModel.pushEvent(SignUpEvents.PhoneChanged("1234567890"))
    }

    // ==================== Mock Implementations ====================

    private class AuthServiceFake : AuthService {
        var signUpCallCount = 0
        var lastSignUpData: SignUpData? = null
        var shouldFail = false

        override suspend fun login(phone: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun signUp(data: SignUpData): Result<Unit> {
            signUpCallCount++
            lastSignUpData = data
            return if (shouldFail) {
                Result.failure(AuthError.InvalidData)
            } else {
                Result.success(Unit)
            }
        }

        override suspend fun verifyPin(pin: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun logout() {
            // No-op
        }
    }

    private class ValidationServiceFake : ValidationService {
        override fun isPhoneValid(phone: String): Boolean {
            return true
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

        override fun isIOS(): Boolean = true

        override fun openMailToSupport(mail: String) {
            // No-op for testing
        }

        override fun openUrl(urlString: String) {
            // No-op for testing
        }
    }
}
