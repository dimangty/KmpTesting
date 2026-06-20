package com.example.kursovikkmp.favorites.ui.favoriteslist

data class FavoriteUiState(
    val id: String = "",
    val title: String = "",
    val text: String = "",
    val imageUrl: String? = null,
    val date: String = "",
)

data class FavoritesListState(
    val articles: List<FavoriteUiState> = emptyList(),
)
