package com.example.kursovikkmp.navigation

import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class VoyagerNavigationService : NavigationService {
    private var navigator: Navigator? = null
    private val backStackData = mutableMapOf<String, Any?>()

    private val _currentDestination = MutableStateFlow("")
    override val currentDestination: StateFlow<String> = _currentDestination.asStateFlow()

    fun setNavigator(navigator: Navigator) {
        this.navigator = navigator
    }

    override fun navigate(action: NavigationAction) {
        val nav = navigator ?: return

        when (action) {
            is NavigationAction.NavigateToLogin -> {
                val screen = com.example.kursovikkmp.ui.screens.auth.LoginScreen
                nav.replaceAll(screen)
                _currentDestination.update { "login" }
            }

            is NavigationAction.NavigateToSignUp -> {
                val screen = com.example.kursovikkmp.ui.screens.auth.SignUpScreen
                nav.push(screen)
                _currentDestination.update { "signup" }
            }

            is NavigationAction.NavigateToPin -> {
                val screen = com.example.kursovikkmp.ui.screens.auth.PinScreen
                nav.push(screen)
                _currentDestination.update { "pin" }
            }

            is NavigationAction.NavigateToMain -> {
                val screen = com.example.kursovikkmp.ui.screens.home.HomeScreen
                nav.replaceAll(screen)
                _currentDestination.update { "home" }
            }

            is NavigationAction.NavigateToNewsDetails -> {
                val screen = com.example.kursovikkmp.ui.screens.news.NewsDetailsScreen(action.title)
                nav.push(screen)
                _currentDestination.update { "news_details" }
            }

            is NavigationAction.NavigateToFavoritesDetails -> {
                val screen = com.example.kursovikkmp.ui.screens.favorites.FavoriteDetailsScreen(action.title)
                nav.push(screen)
                _currentDestination.update { "favorites_details" }
            }

            is NavigationAction.NavigateToRecipesDetails -> {
                val screen = com.example.kursovikkmp.ui.screens.recipes.RecipesDetailsScreen(action.recipeId)
                nav.push(screen)
                _currentDestination.update { "recipes_details" }
            }

            is NavigationAction.NavigateBack -> {
                navigateBack()
            }
        }
    }

    override fun navigateBack() {
        navigator?.pop()
    }

    override fun <T> setPreviousBackStackEntry(key: String, value: T) {
        backStackData[key] = value
    }

    override fun <T> getCurrentBackStackEntry(key: String): T? {
        @Suppress("UNCHECKED_CAST")
        return backStackData[key] as? T
    }

    override fun <T> clearCurrentBackStackEntry(key: String) {
        backStackData.remove(key)
    }
}
