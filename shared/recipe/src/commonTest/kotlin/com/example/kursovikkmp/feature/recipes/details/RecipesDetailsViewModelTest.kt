package com.example.kursovikkmp.feature.recipes.details

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.feature.recipes.RecipesService
import com.example.kursovikkmp.feature.recipes.model.Recipe
import com.example.kursovikkmp.feature.recipes.model.RecipeIngredient
import com.example.kursovikkmp.feature.recipes.model.RecipeStep
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

@OptIn(ExperimentalCoroutinesApi::class)
class RecipesDetailsViewModelTest {

    private lateinit var viewModel: RecipesDetailsViewModel
    private lateinit var recipesService: RecipesServiceFake
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        // Initialize test dependencies
        recipesService = RecipesServiceFake()

        // Start Koin with test module
        startKoin {
            modules(
                module {
                    single<NavigationService> { NavigationServiceFake() }
                    single<ResourceService> { ResourceServiceFake() }
                    single<DeviceService> { DeviceServiceFake() }
                    factory { LceStateManager() }
                }
            )
        }
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    // ==================== Tests for OnRetryClicked Event ====================

    @Test
    fun onRetryClicked_loadsRecipeDetails() = runTest {
        // Given
        viewModel = RecipesDetailsViewModel("recipe123", recipesService)
        viewModel.initScreenData()
        testDispatcher.scheduler.advanceUntilIdle()

        // When
        viewModel.pushEvent(RecipesDetailsEvents.OnRetryClicked)
        testDispatcher.scheduler.advanceUntilIdle()

        // Then
        assertEquals(2, recipesService.getRecipeByIdCallCount) // 1 from init + 1 from retry
    }

    // ==================== Mock Implementations ====================

    private class RecipesServiceFake : RecipesService {
        var getRecipeByIdCallCount = 0
        var mockRecipe: Recipe? = null

        override suspend fun getRecipes(): List<Recipe> {
            return emptyList()
        }

        override suspend fun getRecipeById(id: String): Recipe? {
            getRecipeByIdCallCount++
            return mockRecipe
        }
    }

    private class NavigationServiceFake : NavigationService {
        private val _currentDestination = MutableStateFlow("")
        override val currentDestination: StateFlow<String> = _currentDestination

        override fun navigate(action: com.example.kursovikkmp.navigation.NavigationAction) {
            // No-op for testing
        }

        override fun navigateBack() {
            // No-op for testing
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
