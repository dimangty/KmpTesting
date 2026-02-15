package com.example.kursovikkmp.gpt.feature.favorites.details

import app.cash.turbine.test
import com.example.kursovikkmp.feature.favorites.list.FavoritesRepository
import com.example.kursovikkmp.feature.news.model.Article
import com.example.kursovikkmp.feature.news.model.toDb
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FavoriteDetailsViewModelCommonTest : BaseViewModelCommonTest() {

    private val repository =
        com.example.kursovikkmp.gpt.feature.favorites.details.FakeFavoritesRepository()

    @Test
    fun initScreenData_loadsArticleIntoState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsViewModel(
                "title",
                repository
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
    fun openClicked_opensArticleUrl() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsViewModel(
                "title",
                repository
            )
        viewModel.initScreenData()
        advanceUntilIdle()

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsEvents.OnOpenClicked)

        // Then
        assertTrue(deviceService.openedUrls.contains("https://example.com"))
    }
}

private class FakeFavoritesRepository : FavoritesRepository {
    private val article = Article(
        author = "A",
        title = "title",
        description = "description",
        url = "https://example.com",
        urlToImage = "img",
        publishedAt = "2025-03-01T13:36:41Z",
        content = "content"
    )

    override fun getAllFlow(): List<Article> = listOf(article)

    override suspend fun get(title: String) = article.toDb()

    override suspend fun insert(article: Article) = Unit

    override suspend fun delete(title: String) = Unit

    override suspend fun check(title: String): Boolean = true
}
