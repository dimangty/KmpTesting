package com.example.kursovikkmp.favorites.ui.favoritedetails

import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoriteUiState

data class FavoriteDetailsState(
    val article: FavoriteUiState? = null,
    val isFavorite: Boolean = false,
)
