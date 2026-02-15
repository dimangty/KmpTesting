package com.example.kursovikkmp.ui.screens.favorites

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsEvents
import com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

@Ignore
class FavoriteDetailsScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun openButton_emitsEvent() = runComposeUiTest {
        val events = mutableListOf<FavoriteDetailsEvents>()

        setContent {
            FavoriteDetailsScreenView(state = FavoriteDetailsState.getMock(), onUiEvent = { events += it })
        }

        onNodeWithText("Open").assertExists().performClick()

        assertEquals(listOf<FavoriteDetailsEvents>(FavoriteDetailsEvents.OnOpenClicked), events)
    }
}
