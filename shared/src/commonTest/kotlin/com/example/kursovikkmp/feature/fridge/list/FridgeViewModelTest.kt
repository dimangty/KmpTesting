package com.example.kursovikkmp.feature.fridge.list

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.feature.fridge.FridgeMockNetworkService
import com.example.kursovikkmp.feature.fridge.model.FridgeProduct
import com.example.kursovikkmp.feature.fridge.model.FridgeRecommendedRecipe
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class FridgeViewModelTest {

    private lateinit var viewModel: FridgeViewModel
    private lateinit var fridgeService: FridgeMockNetworkServiceFake
    private lateinit var navigationService: NavigationServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        fridgeService = FridgeMockNetworkServiceFake()
        navigationService = NavigationServiceFake()

        // Start Koin with test module
        startKoin {
            modules(
                module {
                    single<NavigationService> { navigationService }
                    single<ResourceService> { ResourceServiceFake() }
                    single<DeviceService> { DeviceServiceFake() }
                    factory { LceStateManager() }
                }
            )
        }

        viewModel = FridgeViewModel(fridgeService)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for OnProductClicked Event ====================

    @Test
    fun onProductClicked_togglesProductSelection() = runTest {
        // Given
        fridgeService.mockProducts = listOf(
            FridgeProduct("1", "Tomato"),
            FridgeProduct("2", "Cheese")
        )
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(FridgeEvents.OnProductClicked("1"))

        // Then
        val product = viewModel.state.productsItems.find { it.id == "1" }
        assertTrue(product?.isSelected == true)
    }

    @Test
    fun onProductClicked_whenSelected_enablesRecommendButton() = runTest {
        // Given
        fridgeService.mockProducts = listOf(FridgeProduct("1", "Tomato"))
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(FridgeEvents.OnProductClicked("1"))

        // Then
        assertTrue(viewModel.state.isRecommendButtonEnabled)
    }

    @Test
    fun onProductClicked_clearsRecommendations() = runTest {
        // Given
        fridgeService.mockProducts = listOf(FridgeProduct("1", "Tomato"))
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(FridgeEvents.OnProductClicked("1"))

        // Then
        assertEquals(0, viewModel.state.recommendationsItems.size)
        assertFalse(viewModel.state.hasRecommendationsRequest)
    }

    // ==================== Tests for OnRecipeClicked Event ====================

    @Test
    fun onRecipeClicked_navigatesToRecipesDetails() = runTest {
        // Given
        val recipeId = "recipe123"

        // When
        viewModel.pushEvent(FridgeEvents.OnRecipeClicked(recipeId))
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(1, navigationService.navigationActions.size)
        val action = navigationService.navigationActions[0] as NavigationAction.NavigateToRecipesDetails
        assertEquals(recipeId, action.recipeId)
    }

    // ==================== Tests for OnRetryClicked Event ====================

    @Test
    fun onRetryClicked_loadsProducts() = runTest {
        // Given
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(FridgeEvents.OnRetryClicked)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(2, fridgeService.getFridgeProductsCallCount) // 1 from init + 1 from retry
    }

    // ==================== Mock Implementations ====================

    private class FridgeMockNetworkServiceFake : FridgeMockNetworkService {
        var mockProducts: List<FridgeProduct> = emptyList()
        var mockRecipes: List<FridgeRecommendedRecipe> = emptyList()
        var getFridgeProductsCallCount = 0

        override suspend fun getFridgeProducts(): List<FridgeProduct> {
            getFridgeProductsCallCount++
            return mockProducts
        }

        override suspend fun getRecommendedRecipes(selectedProducts: List<String>): List<FridgeRecommendedRecipe> {
            return mockRecipes
        }
    }

    private class NavigationServiceFake : NavigationService {
        private val _currentDestination = MutableStateFlow("")
        override val currentDestination: StateFlow<String> = _currentDestination

        val navigationActions = mutableListOf<NavigationAction>()

        override fun navigate(action: NavigationAction) {
            navigationActions.add(action)
        }

        override fun navigateBack() {
            navigationActions.add(NavigationAction.NavigateBack)
        }

        override fun <T> setPreviousBackStackEntry(key: String, value: T) {
            // No-op for testing
        }

        override fun <T> getCurrentBackStackEntry(key: String): T? {
            return null
        }

        override fun <T> clearCurrentBackStackEntry(key: String) {
            // No-op for testing
        }
    }

    private class ResourceServiceFake : ResourceService {
        override fun getString(stringRes: StringResource): String {
            return "Test String"
        }

        override fun getString(stringRes: StringResource, args: List<String>): String {
            return "Test String with args"
        }
    }

    private class DeviceServiceFake : DeviceService {
        override fun isAndroid(): Boolean = false

        override fun isIOS(): Boolean = true

        override fun openMailToSupport(mail: String) {
            // No-op for testing
        }

        override fun openUrl(urlString: String) {
            // No-op for testing
        }
    }
}
