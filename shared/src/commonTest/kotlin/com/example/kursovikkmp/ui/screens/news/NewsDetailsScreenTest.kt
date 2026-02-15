package com.example.kursovikkmp.ui.screens.news

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.news.details.NewsDetailsEvents
import com.example.kursovikkmp.feature.news.details.NewsDetailsState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

@Ignore
class NewsDetailsScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun openButton_emitsEvent() = runComposeUiTest {
        val events = mutableListOf<NewsDetailsEvents>()

        setContent {
            NewsDetailsScreenView(state = NewsDetailsState.getMock(), onUiEvent = { events += it })
        }

        onNodeWithText("Open").assertExists().performClick()

        assertEquals(
            listOf<NewsDetailsEvents>(NewsDetailsEvents.OnOpenClicked),
            events.filterIsInstance<NewsDetailsEvents>()
        )
    }
}
