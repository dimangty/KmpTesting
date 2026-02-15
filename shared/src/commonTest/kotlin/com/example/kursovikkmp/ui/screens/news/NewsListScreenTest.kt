package com.example.kursovikkmp.ui.screens.news

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.news.list.NewsListEvents
import com.example.kursovikkmp.feature.news.list.NewsListState
import com.example.kursovikkmp.feature.news.list.NewsUiState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class NewsListScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun searchAndItemClick_emitEvents() = runComposeUiTest {
        val events = mutableListOf<NewsListEvents>()
        val state = NewsListState(
            newsItems = listOf(
                NewsUiState(
                    id = "1",
                    title = "Article One",
                    text = "Description",
                    date = "Today",
                    imageUrl = ""
                )
            ),
            searchPlaceholder = "Search"
        )

        setContent {
            NewsListScreenView(state = state, onUiEvent = { events += it })
        }

        onNodeWithText("Article One").assertExists().performClick()
        onNode(hasSetTextAction()).performTextInput("crypto")

        assertTrue(events.any { it is NewsListEvents.OnItemClicked && it.title == "Article One" })
        assertTrue(events.any { it is NewsListEvents.OnSearchQueryChanged && it.query.contains("crypto") })
    }
}
