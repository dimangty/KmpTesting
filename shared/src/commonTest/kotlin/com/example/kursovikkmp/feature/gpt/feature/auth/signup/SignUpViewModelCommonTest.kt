package com.example.kursovikkmp.gpt.feature.auth.signup

import app.cash.turbine.test
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
import com.example.kursovikkmp.feature.auth.ValidationService
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class SignUpViewModelCommonTest : BaseViewModelCommonTest() {

    private val authService =
        com.example.kursovikkmp.gpt.feature.auth.signup.FakeSignUpAuthService()
    private val validationService =
        com.example.kursovikkmp.gpt.feature.auth.signup.FakeValidationService()

    @Test
    fun phoneChanged_filtersToDigits() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.signup.SignUpViewModel(
                authService,
                validationService
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.PhoneChanged("+1 (23)ab45"))
            val updated = awaitItem()

            // Then
            assertEquals("12345", updated.phone)
            assertEquals("12345", updated.phoneField.value)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun createAccountTapped_whenFormValid_navigatesToPin() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.signup.SignUpViewModel(
                authService,
                validationService
            )
        authService.signUpGate = CompletableDeferred()

        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.FirstNameChanged("John"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.LastNameChanged("Doe"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.GenderChanged("Male"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.BirthDateChanged("2000-01-01"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CountryChanged("USA"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CityChanged("NY"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.EmailChanged("john@example.com"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.PhoneChanged("1234567"))

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CreateAccountTapped)
        authService.signUpGate?.complete(Unit)
        advanceUntilIdle()

        // Then
        assertTrue(navigationService.recordedActions.contains(NavigationAction.NavigateToPin))
    }

    @Test
    fun backButtonTapped_callsNavigateBack() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.signup.SignUpViewModel(
                authService,
                validationService
            )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.BackButtonTapped)

        // Then
        assertTrue(navigationService.recordedActions.contains(NavigationAction.NavigateBack))
    }

    @Test
    fun createAccountTapped_whenSignUpFails_setsError() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.signup.SignUpViewModel(
                authService,
                validationService
            )
        authService.signUpResult = Result.failure(IllegalStateException("fail"))

        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.FirstNameChanged("John"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.LastNameChanged("Doe"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.GenderChanged("Male"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.BirthDateChanged("2000-01-01"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CountryChanged("USA"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CityChanged("NY"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.EmailChanged("john@example.com"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.PhoneChanged("1234567"))

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.signup.SignUpEvents.CreateAccountTapped)
        advanceUntilIdle()

        // Then
        assertFalse(viewModel.state.isLoading)
        assertTrue(viewModel.state.errorMessage?.isNotBlank() == true)
    }
}

private class FakeSignUpAuthService : AuthService {
    var signUpResult: Result<Unit> = Result.success(Unit)
    var signUpGate: CompletableDeferred<Unit>? = null

    override suspend fun login(phone: String): Result<Unit> = Result.success(Unit)

    override suspend fun signUp(data: SignUpData): Result<Unit> {
        signUpGate?.await()
        return signUpResult
    }

    override suspend fun verifyPin(pin: String): Result<Unit> = Result.success(Unit)

    override suspend fun logout() = Unit
}

private class FakeValidationService : ValidationService {
    override fun isPhoneValid(phone: String): Boolean = true
    override fun isEmailValid(email: String): Boolean = true
    override fun isNameValid(name: String): Boolean = true
}
