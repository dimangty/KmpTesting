package com.example.kursovikkmp.feature.favorites.list

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.feature.news.model.Article
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

@OptIn(ExperimentalCoroutinesApi::class)
class FavoritesListViewModelTest {

    private lateinit var viewModel: FavoritesListViewModel
    private lateinit var favoritesRepository: FavoritesRepositoryFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        favoritesRepository = FavoritesRepositoryFake()
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

        viewModel = FavoritesListViewModel(favoritesRepository)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for OnItemClicked Event ====================

    @Test
    fun onItemClicked_navigatesToFavoritesDetails() = runTest {
        // Given
        val title = "Test Article"

        // When
        viewModel.pushEvent(FavoritesListEvents.OnItemClicked(title))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, navigationService.navigationActions.size)
        val action = navigationService.navigationActions[0] as NavigationAction.NavigateToFavoritesDetails
        assertEquals(title, action.title)
    }

    // ==================== Mock Implementations ====================

    private class FavoritesRepositoryFake : FavoritesRepository {
        val favorites = mutableListOf<Article>()

        override fun getAllFlow(): List<Article> {
            return favorites
        }

        override suspend fun insert(article: Article) {
            favorites.add(article)
        }

        override suspend fun delete(title: String) {
            favorites.removeAll { it.title == title }
        }

        override suspend fun check(title: String): Boolean {
            return favorites.any { it.title == title }
        }

        override suspend fun get(title: String): com.example.kursovikkmp.database.ArticleDb? {
            return null
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
