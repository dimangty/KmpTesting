package com.example.kursovikkmp.news.ui.newsdetails

import com.example.kursovikkmp.news.domain.Article

data class NewsDetailsState(
    val article: Article? = null,
    val isFavorite: Boolean = false,
)
