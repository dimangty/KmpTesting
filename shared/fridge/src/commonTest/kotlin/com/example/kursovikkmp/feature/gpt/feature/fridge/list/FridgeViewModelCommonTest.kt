package com.example.kursovikkmp.gpt.feature.fridge.list

import app.cash.turbine.test
import com.example.kursovikkmp.feature.fridge.FridgeMockNetworkService
import com.example.kursovikkmp.feature.fridge.model.FridgeProduct
import com.example.kursovikkmp.feature.fridge.model.FridgeRecommendedRecipe
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FridgeViewModelCommonTest : BaseViewModelCommonTest() {

    private val service =
        com.example.kursovikkmp.gpt.feature.fridge.list.FakeFridgeMockNetworkService()

    @Test
    fun productClicked_togglesSelectionAndEnablesRecommendButton() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.fridge.list.FridgeViewModel(service)
        viewModel.initScreenData()
        advanceUntilIdle()

        viewModel.flowState.test {
            val initial = awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.fridge.list.FridgeEvents.OnProductClicked(initial.productsItems.first().id))
            val updated = awaitItem()

            // Then
            assertTrue(updated.productsItems.first().isSelected)
            assertTrue(updated.isRecommendButtonEnabled)
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun recipeClicked_navigatesToRecipeDetails() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.fridge.list.FridgeViewModel(service)

        // When
        viewModel.pushEvent(com.example.kursovikkmp.feature.fridge.list.FridgeEvents.OnRecipeClicked("recipe-1"))

        // Then
        assertTrue(navigationService.recordedActions.any {
            it is com.example.kursovikkmp.navigation.NavigationAction.NavigateToRecipesDetails &&
                it.recipeId == "recipe-1"
        })
    }

    @Test
    fun recommendClicked_withNoSelection_setsHasRecommendationsRequest() = runTest {
        // Given
        val viewModel =
            com.example.kursovikkmp.feature.fridge.list.FridgeViewModel(service)
        viewModel.initScreenData()
        advanceUntilIdle()

        viewModel.flowState.test {
            awaitItem()

            // When
            viewModel.pushEvent(com.example.kursovikkmp.feature.fridge.list.FridgeEvents.OnRecommendRecipesClicked)
            advanceUntilIdle()
            val updated = awaitItem()

            // Then
            assertTrue(updated.hasRecommendationsRequest)
            assertEquals(0, updated.recommendationsItems.size)
            cancelAndIgnoreRemainingEvents()
        }
    }
}

private class FakeFridgeMockNetworkService : FridgeMockNetworkService {
    override suspend fun getFridgeProducts(): List<FridgeProduct> {
        return listOf(
            FridgeProduct(id = "1", name = "Milk"),
            FridgeProduct(id = "2", name = "Egg")
        )
    }

    override suspend fun getRecommendedRecipes(selectedProducts: List<String>): List<FridgeRecommendedRecipe> {
        return listOf(
            FridgeRecommendedRecipe(
                id = "recipe-1",
                title = "Omelette",
                description = "Simple",
                durationMinutes = 10,
                imageUrl = "url",
                matchedIngredients = selectedProducts
            )
        )
    }
}
