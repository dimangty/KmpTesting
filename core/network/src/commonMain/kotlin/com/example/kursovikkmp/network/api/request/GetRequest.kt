package com.example.kursovikkmp.network.api.request

import com.example.kursovikkmp.network.ApiErrorMessage
import com.example.kursovikkmp.network.api.ApiHttpClient
import com.example.kursovikkmp.remoteresult.RemoteResult
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.utils.io.errors.IOException
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json

class GetRequest(
    private val apiHttpClient: ApiHttpClient,
    private val json: Json,
) {
    suspend inline fun <reified T> get(
        path: String,
        queryParams: Map<String, String> = emptyMap(),
        headers: Map<String, String> = emptyMap(),
    ): RemoteResult<T> {
        return try {
            val response = apiHttpClient.client.get(path) {
                queryParams.forEach { (key, value) ->
                    parameter(key, value)
                }
                headers.forEach { (key, value) ->
                    header(key, value)
                }
            }
            if (response.status.isSuccess()) {
                RemoteResult.Success(response.body())
            } else {
                RemoteResult.Error.ServerError(
                    code = response.status.value,
                    message = parseErrorMessage(response.bodyAsText()),
                )
            }
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

    @PublishedApi
    internal fun parseErrorMessage(rawBody: String): String {
        if (rawBody.isBlank()) {
            return "Unknown server error"
        }

        return runCatching {
            json.decodeFromString<ApiErrorMessage>(rawBody).message
        }.getOrNull().orEmpty().ifBlank { rawBody }
    }
}
