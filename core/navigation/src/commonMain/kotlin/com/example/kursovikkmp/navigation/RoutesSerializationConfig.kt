package com.example.kursovikkmp.navigation

import androidx.navigation3.runtime.NavKey
import androidx.savedstate.serialization.SavedStateConfiguration
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

val RoutesSerializationConfig = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(NavigationAction.NavigateToLogin::class)
            subclass(NavigationAction.NavigateToSignUp::class)
            subclass(NavigationAction.NavigateToPin::class)
            subclass(NavigationAction.NavigateToMain::class)
            subclass(NavigationAction.NavigateToHome::class)
            subclass(NavigationAction.NavigateToProfile::class)
            subclass(NavigationAction.NavigateToNotifications::class)
            subclass(NavigationAction.NavigateToNewsDetails::class)
            subclass(NavigationAction.NavigateToFavoritesDetails::class)
            subclass(NavigationAction.NavigateToRecipesDetails::class)
            subclass(NavigationAction.NavigateToNewsList::class)
            subclass(NavigationAction.NavigateToFavoritesList::class)
            subclass(NavigationAction.NavigateToRecipesList::class)
            subclass(NavigationAction.NavigateToFridge::class)
        }
    }
}
