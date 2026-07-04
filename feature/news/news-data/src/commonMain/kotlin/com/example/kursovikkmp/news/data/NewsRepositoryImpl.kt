package com.example.kursovikkmp.news.data

import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.network.news.NewsApi
import com.example.kursovikkmp.news.domain.Article
import com.example.kursovikkmp.news.domain.NewsRepository
import com.example.kursovikkmp.remoteresult.RemoteResult

class NewsRepositoryImpl(
    private val newsApi: NewsApi,
    private val favoritesRepository: FavoritesRepository,
) : NewsRepository {
    private var cachedArticles: List<Article> = emptyList()

    override suspend fun getNews(): RemoteResult<List<Article>> {
        return when (val response = newsApi.getNews()) {
            is RemoteResult.Success -> {
                val articles = response.data.articles.mapNotNull { articleDto ->
                    val title = articleDto.title?.takeIf { it.isNotBlank() } ?: return@mapNotNull null
                    Article(
                        author = articleDto.author,
                        title = title,
                        description = articleDto.description,
                        url = articleDto.url.orEmpty(),
                        urlToImage = articleDto.imageUrl,
                        publishedAt = articleDto.publishedAt.orEmpty(),
                        content = articleDto.content,
                    )
                }
                cachedArticles = articles
                RemoteResult.Success(articles)
            }

            is RemoteResult.Error -> response
        }
    }

    override suspend fun isFavorite(title: String): Boolean = favoritesRepository.check(title)

    override suspend fun addToFavorites(article: Article) {
        favoritesRepository.add(article)
    }

    override suspend fun removeFromFavorites(title: String) {
        favoritesRepository.remove(title)
    }

    override fun getCachedArticleByTitle(title: String): Article? {
        return cachedArticles.find { it.title == title }
    }
}
