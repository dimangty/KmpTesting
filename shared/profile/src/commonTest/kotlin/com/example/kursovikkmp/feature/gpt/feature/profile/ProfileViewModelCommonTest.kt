package com.example.kursovikkmp.gpt.feature.profile

import app.cash.turbine.test
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ProfileViewModelCommonTest : BaseViewModelCommonTest() {

    private val profileRepository =
        com.example.kursovikkmp.gpt.feature.profile.FakeProfileRepository()
    private val authService =
        com.example.kursovikkmp.gpt.feature.profile.FakeAuthService()

    @Test
    fun initScreenData_loadsProfileToState() = runTest {
        // Given
        val viewModel = com.example.kursovikkmp.feature.profile.ProfileViewModel(
            profileRepository,
            authService
        )

        // When
        viewModel.initScreenData()

        // Then
        viewModel.flowState.test {
            val state = awaitItem()
            assertEquals("John Doe", state.fullName)
            assertTrue(state.location.isNotBlank())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun avatarTapped_emitsShowImageSourceDialogEffect() = runTest {
        // Given
        val viewModel = com.example.kursovikkmp.feature.profile.ProfileViewModel(
            profileRepository,
            authService
        )

        viewModel.effectFlow.test {
            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.profile.ProfileEvents.AvatarTapped)

            // Then
            assertEquals(com.example.kursovikkmp.feature.profile.ProfileEffect.ShowImageSourceDialog, awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun logoutTapped_navigatesToLogin() = runTest {
        // Given
        val viewModel = com.example.kursovikkmp.feature.profile.ProfileViewModel(
            profileRepository,
            authService
        )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.profile.ProfileEvents.LogoutTapped)
        advanceUntilIdle()

        // Then
        assertTrue(authService.loggedOut)
        assertTrue(navigationService.recordedActions.contains(NavigationAction.NavigateToLogin))
    }
}

private class FakeProfileRepository : com.example.kursovikkmp.feature.profile.ProfileRepository {
    private var profile = com.example.kursovikkmp.feature.profile.ProfileData.Companion.mock()

    override fun hasSavedProfile(): Boolean = true

    override fun getProfileOrMock(): com.example.kursovikkmp.feature.profile.ProfileData = profile

    override suspend fun saveProfile(data: com.example.kursovikkmp.feature.profile.ProfileData) {
        profile = data
    }

    override suspend fun updatePhoto(photoPath: String) {
        profile = profile.copy(photoPath = photoPath)
    }

    override suspend fun clear() = Unit
}

private class FakeAuthService : AuthService {
    var loggedOut = false

    override suspend fun login(phone: String): Result<Unit> = Result.success(Unit)
    override suspend fun signUp(data: SignUpData): Result<Unit> = Result.success(Unit)
    override suspend fun verifyPin(pin: String): Result<Unit> = Result.success(Unit)
    override suspend fun logout() {
        loggedOut = true
    }
}
