package com.example.kursovikkmp.news.ui.newsdetails

import com.example.kursovikkmp.news.domain.Article
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonState
import com.example.kursovikkmp.uikit.component.text.EpsTextState

data class NewsDetailsState(
    val article: Article? = null,
    val isFavorite: Boolean = false,
    val titleTextState: EpsTextState = EpsTextState(),
    val descriptionTextState: EpsTextState = EpsTextState(),
    val favoriteButtonState: EpsButtonState = EpsButtonState(),
)
