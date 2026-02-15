package com.example.kursovikkmp.gpt.feature.recipes.details

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

class RecipesDetailsViewModelCommonTest : BaseViewModelCommonTest() {

    private val recipesService =
        com.example.kursovikkmp.gpt.feature.recipes.details.FakeDetailsRecipesService()

    @Test
    fun initScreenData_loadsRecipeDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.recipes.details.RecipesDetailsViewModel(
                "1",
                recipesService
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.initScreenData()
            advanceUntilIdle()
            val updated = awaitItem()

            // Then
            assertTrue(updated.titleState.value.isNotBlank())
            assertEquals(1, updated.ingredientsItems.size)
            assertEquals(1, updated.stepsItems.size)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun retryClicked_reloadsRecipeDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.recipes.details.RecipesDetailsViewModel(
                "1",
                recipesService
            )

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.recipes.details.RecipesDetailsEvents.OnRetryClicked)
            advanceUntilIdle()
            val updated = awaitItem()

            // Then
            assertTrue(updated.descriptionState.value.isNotBlank())
            cancelAndIgnoreRemainingEvents()
        }
    }
}

private class FakeDetailsRecipesService : RecipesService {
    override suspend fun getRecipes(): List<Recipe> = emptyList()

    override suspend fun getRecipeById(id: String): Recipe? {
        return Recipe(
            id = id,
            title = "Soup",
            description = "Hot soup",
            durationMinutes = 20,
            imageUrl = "url",
            ingredients = listOf(RecipeIngredient("Water", "1l")),
            steps = listOf(RecipeStep("Boil", 10))
        )
    }
}
