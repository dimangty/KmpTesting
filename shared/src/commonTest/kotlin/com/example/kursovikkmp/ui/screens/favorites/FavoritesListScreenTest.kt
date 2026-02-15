package com.example.kursovikkmp.ui.screens.favorites

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.favorites.list.FavoriteUiState
import com.example.kursovikkmp.feature.favorites.list.FavoritesListEvents
import com.example.kursovikkmp.feature.favorites.list.FavoritesListState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class FavoritesListScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun itemClick_emitsEvent() = runComposeUiTest {
        val events = mutableListOf<FavoritesListEvents>()
        val state = FavoritesListState(
            favoritesItems = listOf(
                FavoriteUiState(
                    id = "1",
                    title = "Favorite Article",
                    text = "text",
                    date = "date",
                    imageUrl = ""
                )
            )
        )

        setContent {
            FavoritesListScreenView(state = state, onUiEvent = { events += it })
        }

        onNodeWithText("Favorite Article").assertExists().performClick()

        assertTrue(events.any { it is FavoritesListEvents.OnItemClicked && it.title == "Favorite Article" })
    }
}
