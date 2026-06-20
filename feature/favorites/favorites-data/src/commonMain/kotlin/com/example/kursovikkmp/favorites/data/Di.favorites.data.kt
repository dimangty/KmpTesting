package com.example.kursovikkmp.favorites.data

import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleFavoritesData = module {
    singleOf(::FavoritesRepositoryImpl) bind FavoritesRepository::class
}
