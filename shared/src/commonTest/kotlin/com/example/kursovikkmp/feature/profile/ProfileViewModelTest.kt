package com.example.kursovikkmp.feature.profile

import app.cash.turbine.test
import com.example.kursovikkmp.common.mvvm.LceStateManager
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
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class ProfileViewModelTest {

    private lateinit var viewModel: ProfileViewModel
    private lateinit var profileRepository: ProfileRepositoryFake
    private lateinit var authService: AuthServiceFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        profileRepository = ProfileRepositoryFake()
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

        viewModel = ProfileViewModel(profileRepository, authService)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for Initial State ====================

    @Test
    fun initialState_whenNoSavedProfile_loadsMockData() = runTest {
        // Given - no saved profile

        // Then
        val state = viewModel.state
        assertEquals("John Doe", state.fullName)
        assertTrue(state.isMockData)
    }

    @Test
    fun initialState_whenHasSavedProfile_loadsProfileData() = runTest {
        // Given
        profileRepository.hasSavedProfileResult = true
        profileRepository.savedProfile = ProfileData(
            firstName = "Jane",
            lastName = "Smith",
            gender = "Female",
            birthDate = "1995-03-15",
            country = "UK",
            city = "London",
            email = "jane@example.com",
            phone = "+441234567890",
            photoPath = "/path/to/photo.jpg"
        )

        // When - create new viewModel with saved profile
        viewModel = ProfileViewModel(profileRepository, authService)

        // Then
        val state = viewModel.state
        assertEquals("Jane Smith", state.fullName)
        assertEquals("Female", state.gender)
        assertEquals("1995-03-15", state.birthDate)
        assertEquals("London, UK", state.location)
        assertEquals("jane@example.com", state.email)
        assertEquals("+441234567890", state.phone)
        assertEquals("/path/to/photo.jpg", state.photoPath)
        assertFalse(state.isMockData)
    }

    @Test
    fun initialState_whenLocationPartsMissing_joinsCorrectly() = runTest {
        // Given
        profileRepository.hasSavedProfileResult = true
        profileRepository.savedProfile = ProfileData(
            firstName = "Test",
            lastName = "User",
            gender = "Other",
            birthDate = "2000-01-01",
            country = "Canada",
            city = "",
            email = "test@example.com",
            phone = "+11234567890",
            photoPath = ""
        )

        // When
        viewModel = ProfileViewModel(profileRepository, authService)

        // Then
        val state = viewModel.state
        assertEquals("Canada", state.location)
    }

    // ==================== Tests for AvatarTapped Event ====================

    @Test
    fun avatarTapped_emitsShowImageSourceDialog() = runTest {
        viewModel.effectFlow.test {
            // When
            viewModel.pushEvent(ProfileEvents.AvatarTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val effect = awaitItem()
            assertEquals(ProfileEffect.ShowImageSourceDialog, effect)
        }
    }

    // ==================== Tests for PhotoChanged Event ====================

    @Test
    fun photoChanged_updatesPhotoInRepository() = runTest {
        // Given
        val photoPath = "/new/photo/path.jpg"

        // When
        viewModel.pushEvent(ProfileEvents.PhotoChanged(photoPath))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, profileRepository.updatePhotoCallCount)
        assertEquals(photoPath, profileRepository.lastPhotoPath)
    }

    @Test
    fun photoChanged_updatesStateWithNewPhoto() = runTest {
        // Given
        val photoPath = "/new/photo/path.jpg"
        profileRepository.hasSavedProfileResult = true
        profileRepository.savedProfile = ProfileData.mock().copy(photoPath = photoPath)

        // When
        viewModel.pushEvent(ProfileEvents.PhotoChanged(photoPath))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        val state = viewModel.state
        assertEquals(photoPath, state.photoPath)
    }

    // ==================== Tests for LogoutTapped Event ====================

    @Test
    fun logoutTapped_callsAuthServiceLogout() = runTest {
        // When
        viewModel.pushEvent(ProfileEvents.LogoutTapped)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, authService.logoutCallCount)
    }

    @Test
    fun logoutTapped_navigatesToLogin() = runTest {
        viewModel.navigationEffectFlow.test {
            // When
            viewModel.pushEvent(ProfileEvents.LogoutTapped)
            testDispatcher.scheduler.advanceUntilIdle()

            // Then
            val navigationAction = awaitItem()
            assertEquals(NavigationAction.NavigateToLogin, navigationAction)
        }
    }

    // ==================== Mock Implementations ====================

    private class ProfileRepositoryFake : ProfileRepository {
        var hasSavedProfileResult = false
        var savedProfile: ProfileData? = null
        var updatePhotoCallCount = 0
        var lastPhotoPath: String? = null

        override fun hasSavedProfile(): Boolean {
            return hasSavedProfileResult
        }

        override fun getProfileOrMock(): ProfileData {
            return savedProfile ?: ProfileData.mock()
        }

        override suspend fun saveProfile(data: ProfileData) {
            savedProfile = data
            hasSavedProfileResult = true
        }

        override suspend fun updatePhoto(photoPath: String) {
            updatePhotoCallCount++
            lastPhotoPath = photoPath
            savedProfile = savedProfile?.copy(photoPath = photoPath) ?: ProfileData.mock().copy(photoPath = photoPath)
        }

        override suspend fun clear() {
            savedProfile = null
            hasSavedProfileResult = false
        }
    }

    private class AuthServiceFake : AuthService {
        var logoutCallCount = 0

        override suspend fun login(phone: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun signUp(data: SignUpData): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun verifyPin(pin: String): Result<Unit> {
            return Result.success(Unit)
        }

        override suspend fun logout() {
            logoutCallCount++
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
