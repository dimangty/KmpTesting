package com.example.kursovikkmp.network.news

import com.example.kursovikkmp.network.NetworkSettings
import com.example.kursovikkmp.network.api.ApiRoute
import com.example.kursovikkmp.network.api.request.GetRequest
import com.example.kursovikkmp.remoteresult.RemoteResult

class NewsApi(
    private val getRequest: GetRequest,
    private val networkSettings: NetworkSettings,
) {
    suspend fun getNews(): RemoteResult<NewsResponseDto> {
        return getRequest.get(
            path = ApiRoute.NEWS,
            queryParams = mapOf(
                "q" to networkSettings.newsQuery,
                "language" to networkSettings.newsLanguage,
                "sortBy" to networkSettings.newsSortBy,
                "apiKey" to networkSettings.apiKey,
            ),
        )
    }
}
