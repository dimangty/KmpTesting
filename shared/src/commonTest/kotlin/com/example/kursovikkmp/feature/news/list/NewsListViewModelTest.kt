package com.example.kursovikkmp.feature.news.list

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.feature.favorites.list.FavoritesRepository
import com.example.kursovikkmp.feature.news.NewsService
import com.example.kursovikkmp.feature.news.model.Article
import com.example.kursovikkmp.feature.news.model.NewsList
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
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
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class NewsListViewModelTest {

    private lateinit var viewModel: NewsListViewModel
    private lateinit var newsService: NewsServiceFake
    private lateinit var favoritesRepository: FavoritesRepositoryFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        newsService = NewsServiceFake()
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

        viewModel = NewsListViewModel(newsService, favoritesRepository)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for OnSearchQueryChanged Event ====================

    @Test
    fun onSearchQueryChanged_updatesSearchQuery() = runTest {
        // Given
        val query = "test query"

        // When
        viewModel.pushEvent(NewsListEvents.OnSearchQueryChanged(query))

        // Then
        assertEquals(query, viewModel.state.searchQuery)
    }

    @Test
    fun onSearchQueryChanged_filtersNewsItems() = runTest {
        // Given
        newsService.mockNews = listOf(
            Article(author = null, title = "Test Article", description = "Test description", url = "", urlToImage = null, publishedAt = "2024-01-01", content = null),
            Article(author = null, title = "Other Article", description = "Other description", url = "", urlToImage = null, publishedAt = "2024-01-02", content = null)
        )
        viewModel.news = newsService.mockNews.toMutableList()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(NewsListEvents.OnSearchQueryChanged("Test"))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, viewModel.state.newsItems.size)
        assertTrue(viewModel.state.newsItems[0].title.contains("Test"))
    }

    @Test
    fun onSearchQueryChanged_whenEmptyQuery_showsAllNews() = runTest {
        // Given
        newsService.mockNews = listOf(
            Article(author = null, title = "Test Article", description = "Test description", url = "", urlToImage = null, publishedAt = "2024-01-01", content = null),
            Article(author = null, title = "Other Article", description = "Other description", url = "", urlToImage = null, publishedAt = "2024-01-02", content = null)
        )
        viewModel.news = newsService.mockNews.toMutableList()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(NewsListEvents.OnSearchQueryChanged(""))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(2, viewModel.state.newsItems.size)
    }

    // ==================== Tests for OnItemClicked Event ====================

    @Test
    fun onItemClicked_navigatesToNewsDetails() = runTest {
        // Given
        val title = "Test Article"

        // When
        viewModel.pushEvent(NewsListEvents.OnItemClicked(title))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, navigationService.navigationActions.size)
        val action = navigationService.navigationActions[0] as NavigationAction.NavigateToNewsDetails
        assertEquals(title, action.title)
    }

    // ==================== Tests for OnFavoriteClicked Event ====================

    @Test
    fun onFavoriteClicked_whenNotFavorite_addToFavorites() = runTest {
        // Given
        val title = "Test Article"
        newsService.mockNews = listOf(
            Article(author = null, title = title, description = "Test description", url = "", urlToImage = null, publishedAt = "2024-01-01", content = null)
        )
        viewModel.news = newsService.mockNews.toMutableList()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(NewsListEvents.OnFavoriteClicked(title))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, favoritesRepository.insertCallCount)
    }

    @Test
    fun onFavoriteClicked_whenAlreadyFavorite_removeFromFavorites() = runTest {
        // Given
        val title = "Test Article"
        val article = Article(author = null, title = title, description = "Test description", url = "", urlToImage = null, publishedAt = "2024-01-01", content = null)
        newsService.mockNews = listOf(article)
        favoritesRepository.favorites.add(article)
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(NewsListEvents.OnFavoriteClicked(title))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, favoritesRepository.deleteCallCount)
    }

    // ==================== Mock Implementations ====================

    private class NewsServiceFake : NewsService {
        var mockNews: List<Article> = emptyList()
        override var news: MutableList<Article>
            get() = mockNews.toMutableList()
            set(value) { mockNews = value }

        override suspend fun getNews(): HttpResponse {
            throw NotImplementedError("Use mockNews for testing")
        }
    }

    private class FavoritesRepositoryFake : FavoritesRepository {
        val favorites = mutableListOf<Article>()
        var insertCallCount = 0
        var deleteCallCount = 0

        override fun getAllFlow(): List<Article> {
            return favorites
        }

        override suspend fun insert(article: Article) {
            insertCallCount++
            favorites.add(article)
        }

        override suspend fun delete(title: String) {
            deleteCallCount++
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
