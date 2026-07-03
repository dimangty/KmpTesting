package com.example.kursovikkmp.uikit.component.articlecard

data class EpsArticleCardState(
    val title: String = "",
    val subtitle: String = "",
    val onClick: (() -> Unit)? = null,
)
