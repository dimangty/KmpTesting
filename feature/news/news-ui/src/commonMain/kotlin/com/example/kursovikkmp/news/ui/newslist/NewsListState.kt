package com.example.kursovikkmp.news.ui.newslist

import com.example.kursovikkmp.news.domain.Article
import com.example.kursovikkmp.uikit.component.articlecard.EpsArticleCardState

data class NewsListState(
    val articles: List<Article> = emptyList(),
    val articleCardStates: List<EpsArticleCardState> = emptyList(),
)
