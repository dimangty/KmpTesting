package com.example.kursovikkmp.di

import com.example.kursovikkmp.DB.DatabaseDriverFactory
import com.example.kursovikkmp.database.KursovikDatabase
import org.koin.dsl.module

val databaseModule = module {
    single<KursovikDatabase> { KursovikDatabase(get<DatabaseDriverFactory>().create()) }
}
