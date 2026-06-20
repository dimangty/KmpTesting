package com.example.kursovikkmp.news.domain

import com.example.kursovikkmp.remoteresult.RemoteResult

interface NewsRepository {
    suspend fun getNews(): RemoteResult<List<Article>>
    suspend fun isFavorite(title: String): Boolean
    suspend fun addToFavorites(article: Article)
    suspend fun removeFromFavorites(title: String)
    fun getCachedArticleByTitle(title: String): Article?
}
