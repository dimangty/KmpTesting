package com.example.kursovikkmp.di

import com.example.kursovikkmp.network.api.ApiHttpClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal actual val platformModule = module {
    singleOf(::ApiHttpClient)
}
