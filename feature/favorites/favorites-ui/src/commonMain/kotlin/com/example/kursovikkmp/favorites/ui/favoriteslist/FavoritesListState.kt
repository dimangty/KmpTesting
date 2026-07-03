package com.example.kursovikkmp.favorites.ui.favoriteslist

import com.example.kursovikkmp.uikit.component.articlecard.EpsArticleCardState
import com.example.kursovikkmp.uikit.component.text.EpsTextState

data class FavoriteUiState(
    val id: String = "",
    val title: String = "",
    val text: String = "",
    val imageUrl: String? = null,
    val date: String = "",
)

data class FavoritesListState(
    val articles: List<FavoriteUiState> = emptyList(),
    val articleCardStates: List<EpsArticleCardState> = emptyList(),
    val emptyTextState: EpsTextState = EpsTextState(),
)
