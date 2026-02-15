package com.example.kursovikkmp.feature.favorites.details

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.feature.favorites.list.FavoritesRepository
import com.example.kursovikkmp.feature.news.model.Article
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
class FavoriteDetailsViewModelTest {

    private lateinit var viewModel: FavoriteDetailsViewModel
    private lateinit var favoritesRepository: FavoritesRepositoryFake
    private lateinit var deviceService: DeviceServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        favoritesRepository = FavoritesRepositoryFake()
        deviceService = DeviceServiceFake()

        // Start Koin with test module
        startKoin {
            modules(
                module {
                    single<NavigationService> { NavigationServiceFake() }
                    single<ResourceService> { ResourceServiceFake() }
                    single<DeviceService> { deviceService }
                    factory { LceStateManager() }
                }
            )
        }

        viewModel = FavoriteDetailsViewModel("Test Article", favoritesRepository)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for OnOpenClicked Event ====================

    @Test
    fun onOpenClicked_opensUrlInDevice() = runTest {
        // Given
        val testUrl = "https://example.com/article"
        // Simulate having an article loaded
        viewModel.article = Article(
            author = "Test Author",
            title = "Test Article",
            description = "Test description",
            url = testUrl,
            urlToImage = null,
            publishedAt = "2024-01-01",
            content = "Test content"
        )

        // When
        viewModel.pushEvent(FavoriteDetailsEvents.OnOpenClicked)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, deviceService.openUrlCallCount)
        assertEquals(testUrl, deviceService.lastOpenedUrl)
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

        override fun navigate(action: com.example.kursovikkmp.navigation.NavigationAction) {
            // No-op for testing
        }

        override fun navigateBack() {
            // No-op for testing
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
        var openUrlCallCount = 0
        var lastOpenedUrl: String? = null

        override fun isAndroid(): Boolean = false

        override fun isIOS(): Boolean = true

        override fun openMailToSupport(mail: String) {
            // No-op for testing
        }

        override fun openUrl(urlString: String) {
            openUrlCallCount++
            lastOpenedUrl = urlString
        }
    }
}
