package com.example.kursovikkmp.gpt.feature.news.details

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

class NewsDetailsViewModelCommonTest : BaseViewModelCommonTest() {

    private val newsService =
        com.example.kursovikkmp.gpt.feature.news.details.FakeDetailsNewsService()
    private val favoritesRepository =
        com.example.kursovikkmp.gpt.feature.news.details.FakeDetailsFavoritesRepository()

    @Test
    fun initScreenData_loadsArticleState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.details.NewsDetailsViewModel(
                "title",
                newsService,
                favoritesRepository
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.initScreenData()
            advanceUntilIdle()
            val updated = awaitItem()

            // Then
            assertEquals("title", updated.titleState.value)
            assertTrue(updated.textState.value.isNotBlank())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun favoriteClicked_insertsWhenNotFavorite() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.details.NewsDetailsViewModel(
                "title",
                newsService,
                favoritesRepository
            )
        viewModel.initScreenData()
        advanceUntilIdle()

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.news.details.NewsDetailsEvents.OnFavoriteClicked)
        advanceUntilIdle()

        // Then
        assertTrue(favoritesRepository.insertedTitles.contains("title"))
    }

    @Test
    fun openClicked_opensArticleUrl() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.news.details.NewsDetailsViewModel(
                "title",
                newsService,
                favoritesRepository
            )
        viewModel.initScreenData()
        advanceUntilIdle()

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.news.details.NewsDetailsEvents.OnOpenClicked)

        // Then
        assertTrue(deviceService.openedUrls.contains("https://example.com"))
    }
}

private class FakeDetailsNewsService : NewsService {
    override var news: MutableList<Article> = mutableListOf(
        Article(
            author = "A",
            title = "title",
            description = "description",
            url = "https://example.com",
            urlToImage = "img",
            publishedAt = "2025-03-01T13:36:41Z",
            content = "content"
        )
    )

    override suspend fun getNews(): HttpResponse {
        error("Not used in this test")
    }
}

private class FakeDetailsFavoritesRepository : FavoritesRepository {
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
