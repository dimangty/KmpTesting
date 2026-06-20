package com.example.kursovikkmp.di

import com.example.kursovikkmp.network.DateSerializer
import com.example.kursovikkmp.network.DateTimeSerializer
import com.example.kursovikkmp.network.NetworkSettings
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import org.koin.dsl.module

@OptIn(ExperimentalSerializationApi::class)
val moduleNetwork = module {
    single {
        Json {
            encodeDefaults = false
            isLenient = true
            ignoreUnknownKeys = true
            explicitNulls = false
            prettyPrint = true
            serializersModule = SerializersModule {
                contextual(LocalDateTime::class, DateTimeSerializer)
                contextual(LocalDate::class, DateSerializer)
            }
        }
    }

    single { NetworkSettings() }

    single {
        HttpClient {
            expectSuccess = false
            install(ContentNegotiation) {
                json(get())
            }
            install(HttpTimeout) {
                requestTimeoutMillis = 30_000
                connectTimeoutMillis = 15_000
                socketTimeoutMillis = 30_000
            }
            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        println(message)
                    }
                }
                level = LogLevel.BODY
            }
        }
    }
}
