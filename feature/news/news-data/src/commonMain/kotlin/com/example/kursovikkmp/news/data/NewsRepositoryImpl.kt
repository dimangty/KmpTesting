package com.example.kursovikkmp.news.data

import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.network.NetworkSettings
import com.example.kursovikkmp.news.domain.Article
import com.example.kursovikkmp.news.domain.NewsRepository
import com.example.kursovikkmp.remoteresult.RemoteResult
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.request.get
import io.ktor.utils.io.errors.IOException
import kotlinx.serialization.SerializationException

class NewsRepositoryImpl(
    private val httpClient: HttpClient,
    private val networkSettings: NetworkSettings,
    private val favoritesRepository: FavoritesRepository,
) : NewsRepository {
    private var cachedArticles: List<Article> = emptyList()

    override suspend fun getNews(): RemoteResult<List<Article>> {
        return try {
            val response = httpClient.get(networkSettings.newsApiUrl).body<NewsResponseDto>()
            val articles = response.articles.mapNotNull { articleDto ->
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
        } catch (_: HttpRequestTimeoutException) {
            RemoteResult.Error.TimeoutError
        } catch (_: SerializationException) {
            RemoteResult.Error.SerializationError
        } catch (_: IOException) {
            RemoteResult.Error.NetworkError
        } catch (error: Throwable) {
            RemoteResult.Error.ServerError(code = -1, message = error.message.orEmpty())
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
