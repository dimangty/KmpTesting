package com.example.kursovikkmp.network.api

import io.ktor.client.HttpClient

internal expect class ApiHttpClient {
    val client: HttpClient
}
