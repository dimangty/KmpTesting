package com.example.kursovikkmp.feature.home

import com.example.kursovikkmp.MR
import com.example.kursovikkmp.common.mvvm.LceStateManager
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
import kotlin.test.assertNotNull

@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {

    private lateinit var viewModel: HomeViewModel
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
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

        viewModel = HomeViewModel()
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for Initial State ====================

    @Test
    fun initialState_hasTabsList() = runTest {
        // Then
        val state = viewModel.state
        assertNotNull(state.tabs)
        assertEquals(4, state.tabs.size)
    }

    @Test
    fun initialState_containsNewsTab() = runTest {
        // Then
        val state = viewModel.state
        assertNotNull(state.tabs.find { it.contains("News", ignoreCase = true) })
    }

    @Test
    fun initialState_containsFavoriteTab() = runTest {
        // Then
        val state = viewModel.state
        assertNotNull(state.tabs.find { it.contains("Favorite", ignoreCase = true) })
    }

    @Test
    fun initialState_containsRecipesTab() = runTest {
        // Then
        val state = viewModel.state
        assertNotNull(state.tabs.find { it.contains("Recipes", ignoreCase = true) })
    }

    @Test
    fun initialState_containsFridgeTab() = runTest {
        // Then
        val state = viewModel.state
        assertNotNull(state.tabs.find { it.contains("Fridge", ignoreCase = true) })
    }

    // ==================== Mock Implementations ====================

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
            return when (stringRes) {
                MR.strings.scr_news_tab_title -> "News"
                MR.strings.scr_favorite_tab_title -> "Favorite"
                MR.strings.scr_recipes_tab_title -> "Recipes"
                MR.strings.scr_fridge_tab_title -> "Fridge"
                else -> "Test String"
            }
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
