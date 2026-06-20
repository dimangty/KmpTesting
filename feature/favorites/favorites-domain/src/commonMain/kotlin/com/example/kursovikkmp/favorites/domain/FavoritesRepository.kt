package com.example.kursovikkmp.favorites.domain

import com.example.kursovikkmp.news.domain.Article

interface FavoritesRepository {
    fun getAll(): List<Article>
    suspend fun get(title: String): Article?
    suspend fun add(article: Article)
    suspend fun remove(title: String)
    suspend fun check(title: String): Boolean
}
