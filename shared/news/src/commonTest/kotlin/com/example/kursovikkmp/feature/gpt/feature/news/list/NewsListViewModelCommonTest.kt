package com.example.kursovikkmp.gpt.feature.news.list

import app.cash.turbine.test
import com.example.kursovikkmp.feature.favorites.list.FavoritesRepository
import com.example.kursovikkmp.feature.news.NewsService
import com.example.kursovikkmp.feature.news.model.Article
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import io.ktor.client.statement.HttpResponse
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NewsListViewModelCommonTest : BaseViewModelCommonTest() {

    private val newsService =
        com.example.kursovikkmp.gpt.feature.news.list.FakeNewsService()
    private val favoritesRepository =
        com.example.kursovikkmp.gpt.feature.news.list.FakeNewsFavoritesRepository()

    @Test
    fun searchQueryChanged_filtersNewsInState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.list.NewsListViewModel(
                newsService,
                favoritesRepository
            )
        viewModel.news = mutableListOf(
            com.example.kursovikkmp.gpt.feature.news.list.article(title = "Kotlin News"),
            com.example.kursovikkmp.gpt.feature.news.list.article(title = "Sports")
        )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.news.list.NewsListEvents.OnSearchQueryChanged("kot"))
            awaitItem()
            val updated = awaitItem()

            // Then
            assertEquals(1, updated.newsItems.size)
            assertEquals("Kotlin News", updated.newsItems.first().title)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun itemClicked_navigatesToNewsDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.list.NewsListViewModel(
                newsService,
                favoritesRepository
            )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.news.list.NewsListEvents.OnItemClicked("Kotlin News"))

        // Then
        assertTrue(navigationService.recordedActions.any {
            it is com.example.kursovikkmp.navigation.NavigationAction.NavigateToNewsDetails &&
                it.title == "Kotlin News"
        })
    }

    @Test
    fun favoriteClicked_togglesFavoriteInRepository() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.list.NewsListViewModel(
                newsService,
                favoritesRepository
            )
        viewModel.news = mutableListOf(
            com.example.kursovikkmp.gpt.feature.news.list.article(
                title = "Kotlin News"
            )
        )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.news.list.NewsListEvents.OnFavoriteClicked("Kotlin News"))
        advanceUntilIdle()

        // Then
        assertTrue(favoritesRepository.insertedTitles.contains("Kotlin News"))
    }
}

private class FakeNewsService : NewsService {
    override var news: MutableList<Article> = mutableListOf()

    override suspend fun getNews(): HttpResponse {
        error("Not used in this test")
    }
}

private class FakeNewsFavoritesRepository : FavoritesRepository {
    private val items = mutableListOf<Article>()
    val insertedTitles = mutableListOf<String>()

    override fun getAllFlow(): List<Article> = items.toList()

    override suspend fun get(title: String) = null

    override suspend fun insert(article: Article) {
        insertedTitles += (article.title ?: "")
        items += article
    }

    override suspend fun delete(title: String) {
        items.removeAll { it.title == title }
    }

    override suspend fun check(title: String): Boolean = items.any { it.title == title }
}

private fun article(title: String) = Article(
    author = "A",
    title = title,
    description = "description",
    url = "https://example.com",
    urlToImage = "img",
    publishedAt = "2025-03-01T13:36:41Z",
    content = "content"
)
