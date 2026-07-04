package com.example.kursovikkmp.network.news

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsResponseDto(
    val status: String,
    val articles: List<ArticleDto> = emptyList(),
)

@Serializable
data class ArticleDto(
    val author: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    @SerialName("urlToImage")
    val imageUrl: String? = null,
    val publishedAt: String? = null,
    val content: String? = null,
)
