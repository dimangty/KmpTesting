package com.example.kursovikkmp.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class NavigationAction : NavKey {
    @Serializable
    data object NavigateToLogin : NavigationAction()

    @Serializable
    data object NavigateToSignUp : NavigationAction()

    @Serializable
    data object NavigateToPin : NavigationAction()

    @Serializable
    data object NavigateToMain : NavigationAction()

    @Serializable
    data object NavigateToHome : NavigationAction()

    @Serializable
    data object NavigateToProfile : NavigationAction()

    @Serializable
    data object NavigateToNotifications : NavigationAction()

    @Serializable
    data class NavigateToNewsDetails(val title: String) : NavigationAction()

    @Serializable
    data class NavigateToFavoritesDetails(val title: String) : NavigationAction()

    @Serializable
    data class NavigateToRecipesDetails(val recipeId: String) : NavigationAction()

    @Serializable
    data object NavigateToNewsList : NavigationAction()

    @Serializable
    data object NavigateToFavoritesList : NavigationAction()

    @Serializable
    data object NavigateToRecipesList : NavigationAction()

    @Serializable
    data object NavigateToFridge : NavigationAction()
}
