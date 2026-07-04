package com.example.kursovikkmp.di

import com.example.kursovikkmp.network.DateSerializer
import com.example.kursovikkmp.network.DateTimeSerializer
import com.example.kursovikkmp.network.NetworkSettings
import com.example.kursovikkmp.network.api.request.GetRequest
import com.example.kursovikkmp.network.news.NewsApi
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

@OptIn(ExperimentalSerializationApi::class)
val moduleNetwork
    get() = module {
        includes(commonModule, platformModule)
    }

internal val commonModule = module {
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

    singleOf(::NetworkSettings)
    singleOf(::GetRequest)
    singleOf(::NewsApi)
}

internal expect val platformModule: Module
