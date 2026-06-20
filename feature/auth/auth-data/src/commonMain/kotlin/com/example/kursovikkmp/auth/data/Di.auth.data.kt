package com.example.kursovikkmp.auth.data

import com.example.kursovikkmp.auth.domain.AuthService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleAuthData = module {
    singleOf(::AuthServiceImpl) bind AuthService::class
}
