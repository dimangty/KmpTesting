package com.example.kursovikkmp.favorites.data

import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.news.domain.Article

class FavoritesRepositoryImpl : FavoritesRepository {
    private val items = mutableListOf<Article>()

    override fun getAll(): List<Article> = items.toList()
    override suspend fun get(title: String): Article? = items.find { it.title == title }
    override suspend fun add(article: Article) {
        items.removeAll { it.title == article.title }
        items.add(article)
    }
    override suspend fun remove(title: String) { items.removeAll { it.title == title } }
    override suspend fun check(title: String): Boolean = items.any { it.title == title }
}
