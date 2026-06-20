package com.example.kursovikkmp.favorites.ui

import com.example.kursovikkmp.favorites.data.moduleFavoritesData
import com.example.kursovikkmp.favorites.domain.moduleFavoritesDomain
import com.example.kursovikkmp.favorites.ui.favoritedetails.FavoriteDetailsScreen
import com.example.kursovikkmp.favorites.ui.favoritedetails.FavoriteDetailsViewModel
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoritesListScreen
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoritesListViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val moduleFavorites = module {
    viewModelOf(::FavoritesListViewModel)
    viewModelOf(::FavoriteDetailsViewModel)

    includes(moduleFavoritesData, moduleFavoritesDomain)

    navigation<NavigationAction.NavigateToFavoritesList> { FavoritesListScreen() }
    navigation<NavigationAction.NavigateToFavoritesDetails> { route -> FavoriteDetailsScreen(route.title) }
}
