package com.example.kursovikkmp.news.ui.newslist

import com.example.kursovikkmp.news.domain.Article

data class NewsListState(
    val articles: List<Article> = emptyList(),
)
