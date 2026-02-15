package com.example.kursovikkmp.gpt.feature.recipes.list

import app.cash.turbine.test
import com.example.kursovikkmp.feature.recipes.RecipesService
import com.example.kursovikkmp.feature.recipes.model.Recipe
import com.example.kursovikkmp.feature.recipes.model.RecipeIngredient
import com.example.kursovikkmp.feature.recipes.model.RecipeStep
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RecipesListViewModelCommonTest : BaseViewModelCommonTest() {

    private val recipesService =
        com.example.kursovikkmp.gpt.feature.recipes.list.FakeRecipesService()

    @Test
    fun retryClicked_loadsRecipesToState() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.recipes.list.RecipesListViewModel(
                recipesService
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.recipes.list.RecipesListEvents.OnRetryClicked)
            advanceUntilIdle()
            val updated = awaitItem()

            // Then
            assertEquals(2, updated.recipesItems.size)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun itemClicked_navigatesToRecipeDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.recipes.list.RecipesListViewModel(
                recipesService
            )

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.recipes.list.RecipesListEvents.OnItemClicked("1"))

        // Then
        assertTrue(navigationService.recordedActions.any {
            it is com.example.kursovikkmp.navigation.NavigationAction.NavigateToRecipesDetails &&
                it.recipeId == "1"
        })
    }
}

private class FakeRecipesService : RecipesService {
    private val recipes = listOf(
        Recipe("1", "Soup", "desc", 15, "url", listOf(RecipeIngredient("Water", "1l")), listOf(RecipeStep("Boil", 10))),
        Recipe("2", "Salad", "desc", 5, "url", listOf(RecipeIngredient("Tomato", "1")), listOf(RecipeStep("Mix", 2)))
    )

    override suspend fun getRecipes(): List<Recipe> = recipes

    override suspend fun getRecipeById(id: String): Recipe? = recipes.firstOrNull { it.id == id }
}
