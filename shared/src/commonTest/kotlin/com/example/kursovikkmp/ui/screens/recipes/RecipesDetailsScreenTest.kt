package com.example.kursovikkmp.ui.screens.recipes

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.feature.recipes.details.RecipesDetailsEvents
import com.example.kursovikkmp.feature.recipes.details.RecipesDetailsState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class RecipesDetailsScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun rendersAndRetryEmitsEvent() = runComposeUiTest {
        val events = mutableListOf<RecipesDetailsEvents>()
        val base = RecipesDetailsState.getMock()

        setContent {
            RecipesDetailsScreenView(state = base, onUiEvent = { events += it })
        }

        onNodeWithText("Шаги приготовления").assertExists()
        onNodeWithText("Начать готовить").assertExists()

        setContent {
            RecipesDetailsScreenView(
                state = base.copy(titleState = base.titleState.updateValue("")),
                onUiEvent = { events += it }
            )
        }

        onNodeWithText("Повторить").assertExists().performClick()
        assertTrue(events.any { it is RecipesDetailsEvents.OnRetryClicked })
    }
}
