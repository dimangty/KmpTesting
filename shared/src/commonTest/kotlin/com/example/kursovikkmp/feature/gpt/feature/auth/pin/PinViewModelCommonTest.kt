package com.example.kursovikkmp.gpt.feature.auth.pin

import app.cash.turbine.test
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
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
class PinViewModelCommonTest : BaseViewModelCommonTest() {

    private val authService =
        com.example.kursovikkmp.gpt.feature.auth.pin.FakeAuthService()

    @Test
    fun pinChanged_updatesFilteredPinAndButtonState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.pin.PinViewModel(authService)

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.auth.pin.PinEvents.PinChanged("12ab345678"))
            val updated = awaitItem()

            // Then
            assertEquals("123456", updated.pin)
            assertTrue(updated.isPinValid)
            assertTrue(updated.confirmButtonState.isEnabled)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun confirmTapped_whenPinValid_navigatesToMain() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.pin.PinViewModel(authService)
        authService.verifyGate = CompletableDeferred()

        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.pin.PinEvents.PinChanged("123456"))

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.pin.PinEvents.ConfirmTapped)
        authService.verifyGate?.complete(Unit)
        advanceUntilIdle()

        // Then
        assertTrue(navigationService.recordedActions.contains(NavigationAction.NavigateToMain))
    }

    @Test
    fun confirmTapped_whenVerifyFails_showsError() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.auth.pin.PinViewModel(authService)
        authService.verifyResult = Result.failure(IllegalStateException("bad"))
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.pin.PinEvents.PinChanged("123456"))

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.auth.pin.PinEvents.ConfirmTapped)
        advanceUntilIdle()

        // Then
        assertFalse(viewModel.state.isLoading)
        assertTrue(viewModel.state.errorMessage?.isNotBlank() == true)
    }
}

private class FakeAuthService : AuthService {
    var verifyResult: Result<Unit> = Result.success(Unit)
    var verifyGate: CompletableDeferred<Unit>? = null

    override suspend fun login(phone: String): Result<Unit> = Result.success(Unit)

    override suspend fun signUp(data: SignUpData): Result<Unit> = Result.success(Unit)

    override suspend fun verifyPin(pin: String): Result<Unit> {
        verifyGate?.await()
        return verifyResult
    }

    override suspend fun logout() = Unit
}
