package com.example.kursovikkmp.gpt.feature.favorites.list

import app.cash.turbine.test
import com.example.kursovikkmp.common.mvvm.ErrorState
import com.example.kursovikkmp.feature.news.model.Article
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FavoritesListViewModelCommonTest : BaseViewModelCommonTest() {

    private val repository =
        com.example.kursovikkmp.gpt.feature.favorites.list.FakeFavoritesListRepository()

    @Test
    fun initScreenData_mapsFavoritesToState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.favorites.list.FavoritesListViewModel(
                repository
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.initScreenData()
            val updated = awaitItem()

            // Then
            assertEquals(1, updated.favoritesItems.size)
            assertEquals("title", updated.favoritesItems.first().title)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun itemClicked_navigatesToFavoriteDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.favorites.list.FavoritesListViewModel(
                repository
            )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.favorites.list.FavoritesListEvents.OnItemClicked("title"))

        // Then
        assertTrue(navigationService.recordedActions.any {
            it is com.example.kursovikkmp.navigation.NavigationAction.NavigateToFavoritesDetails &&
                it.title == "title"
        })
    }

    @Test
    fun favoriteClicked_showsDeleteAlertAndPositiveActionDeletesItem() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.favorites.list.FavoritesListViewModel(
                repository
            )
        viewModel.initScreenData()

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.favorites.list.FavoritesListEvents.OnFavoriteClicked("title"))
        advanceUntilIdle()
        val alert = viewModel.lceState.value.errorState as? ErrorState.AlertError
        alert?.positiveAction?.invoke()
        advanceUntilIdle()

        // Then
        assertTrue(repository.deletedTitles.contains("title"))
        assertEquals(0, viewModel.state.favoritesItems.size)
    }
}

private class FakeFavoritesListRepository :
    com.example.kursovikkmp.feature.favorites.list.FavoritesRepository {
    private val items = mutableListOf(
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

    val deletedTitles = mutableListOf<String>()

    override fun getAllFlow(): List<Article> = items.toList()

    override suspend fun get(title: String) = null

    override suspend fun insert(article: Article) {
        items += article
    }

    override suspend fun delete(title: String) {
        deletedTitles += title
        items.removeAll { it.title == title }
    }

    override suspend fun check(title: String): Boolean = items.any { it.title == title }
}
