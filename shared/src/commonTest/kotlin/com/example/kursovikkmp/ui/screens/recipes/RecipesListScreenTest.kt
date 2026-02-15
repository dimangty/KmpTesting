package com.example.kursovikkmp.ui.screens.recipes

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.recipes.list.RecipeUiState
import com.example.kursovikkmp.feature.recipes.list.RecipesListEvents
import com.example.kursovikkmp.feature.recipes.list.RecipesListState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class RecipesListScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun itemAndRetry_emitEvents() = runComposeUiTest {
        val itemEvents = mutableListOf<RecipesListEvents>()
        val retryEvents = mutableListOf<RecipesListEvents>()

        setContent {
            RecipesListScreenView(
                state = RecipesListState(
                    recipesItems = listOf(
                        RecipeUiState(
                            id = "recipe-1",
                            title = "Recipe One",
                            text = "Text",
                            duration = "10 min",
                            imageUrl = ""
                        )
                    )
                ),
                onUiEvent = { itemEvents += it }
            )
        }

        onNodeWithText("Recipe One").assertExists().performClick()
        assertTrue(itemEvents.any { it is RecipesListEvents.OnItemClicked && it.recipeId == "recipe-1" })

        setContent {
            RecipesListScreenView(
                state = RecipesListState(recipesItems = emptyList()),
                onUiEvent = { retryEvents += it }
            )
        }

        onNodeWithText("Повторить").assertExists().performClick()
        assertTrue(retryEvents.any { it is RecipesListEvents.OnRetryClicked })
    }
}
