package com.example.kursovikkmp.ui.screens.fridge

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.*
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.fridge.list.FridgeEvents
import com.example.kursovikkmp.feature.fridge.list.FridgeProductUiState
import com.example.kursovikkmp.feature.fridge.list.FridgeRecommendedRecipeUiState
import com.example.kursovikkmp.feature.fridge.list.FridgeState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

@Ignore
class FridgeScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun searchQuery_filtersVisibleProducts() = runComposeUiTest {
        setContent {
            FridgeScreenView(
                state = baseState(
                    products = listOf(
                        FridgeProductUiState(id = "1", name = "Тофу", isSelected = false),
                        FridgeProductUiState(id = "2", name = "Рис", isSelected = false)
                    )
                ),
                onUiEvent = {}
            )
        }

        onNodeWithText("Тофу").assertExists()
        onNodeWithText("Рис").assertExists()

        onNode(hasSetTextAction()).performTextInput("рис")

        onNodeWithText("Рис").assertExists()
        onNodeWithText("Тофу").assertDoesNotExist()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun clickProduct_emitsOnProductClickedEvent() = runComposeUiTest {
        val uiEvents = mutableListOf<FridgeEvents>()

        setContent {
            FridgeScreenView(
                state = baseState(
                    products = listOf(
                        FridgeProductUiState(id = "product-id", name = "Тофу", isSelected = false)
                    )
                ),
                onUiEvent = { uiEvents += it }
            )
        }

        onNodeWithText("Тофу").performClick()

        assertEquals(listOf<FridgeEvents>(FridgeEvents.OnProductClicked("product-id")), uiEvents)
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun clickRecommendAndRetry_emitsExpectedEvents() = runComposeUiTest {
        val uiEvents = mutableListOf<FridgeEvents>()

        setContent {
            FridgeScreenView(
                state = baseState(
                    products = listOf(FridgeProductUiState(id = "1", name = "Рис", isSelected = true)),
                    isRecommendButtonEnabled = true,
                    hasRecommendationsRequest = true,
                    recommendations = emptyList()
                ),
                onUiEvent = { uiEvents += it }
            )
        }

        onNodeWithText("Рекомендовать рецепты").performClick()
        onNodeWithText("Повторить").performClick()

        assertEquals(
            listOf<FridgeEvents>(
                FridgeEvents.OnRecommendRecipesClicked,
                FridgeEvents.OnRetryClicked
            ),
            uiEvents
        )
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun clickRecipeCard_emitsOnRecipeClickedEvent() = runComposeUiTest {
        val uiEvents = mutableListOf<FridgeEvents>()

        setContent {
            FridgeScreenView(
                state = baseState(
                    products = listOf(FridgeProductUiState(id = "1", name = "Рис", isSelected = true)),
                    hasRecommendationsRequest = true,
                    recommendations = listOf(
                        FridgeRecommendedRecipeUiState(
                            id = "recipe-id",
                            title = "Поке",
                            description = "Описание",
                            duration = "30 мин",
                            imageUrl = "",
                            matchedIngredientsText = "Рис"
                        )
                    )
                ),
                onUiEvent = { uiEvents += it }
            )
        }

        onNodeWithText("Поке").performClick()

        assertEquals(listOf<FridgeEvents>(FridgeEvents.OnRecipeClicked("recipe-id")), uiEvents)
    }

    private fun baseState(
        products: List<FridgeProductUiState>,
        recommendations: List<FridgeRecommendedRecipeUiState> = emptyList(),
        isRecommendButtonEnabled: Boolean = false,
        hasRecommendationsRequest: Boolean = false
    ): FridgeState {
        return FridgeState(
            productsItems = products,
            recommendationsItems = recommendations,
            isRecommendButtonEnabled = isRecommendButtonEnabled,
            hasRecommendationsRequest = hasRecommendationsRequest
        )
    }
}
