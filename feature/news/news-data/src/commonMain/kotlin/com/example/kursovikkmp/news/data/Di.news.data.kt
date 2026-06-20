package com.example.kursovikkmp.news.data

import com.example.kursovikkmp.news.domain.NewsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleNewsData = module {
    singleOf(::NewsRepositoryImpl) bind NewsRepository::class
}
