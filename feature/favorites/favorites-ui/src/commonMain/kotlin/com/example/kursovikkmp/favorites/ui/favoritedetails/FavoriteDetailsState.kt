package com.example.kursovikkmp.favorites.ui.favoritedetails

import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoriteUiState
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonState
import com.example.kursovikkmp.uikit.component.text.EpsTextState

data class FavoriteDetailsState(
    val article: FavoriteUiState? = null,
    val isFavorite: Boolean = false,
    val titleTextState: EpsTextState = EpsTextState(),
    val descriptionTextState: EpsTextState = EpsTextState(),
    val removeButtonState: EpsButtonState = EpsButtonState(),
)
