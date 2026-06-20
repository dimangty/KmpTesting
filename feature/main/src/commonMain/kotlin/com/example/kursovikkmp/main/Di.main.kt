package com.example.kursovikkmp.main

import com.example.kursovikkmp.main.container.MainContainerScreen
import com.example.kursovikkmp.main.container.MainContainerViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val moduleMain = module {
    viewModelOf(::MainViewModel)
    viewModelOf(::MainContainerViewModel)

    navigation<NavigationAction.NavigateToMain> { MainContainerScreen() }

    includes(
        com.example.kursovikkmp.auth.ui.moduleAuth,
        com.example.kursovikkmp.news.ui.moduleNews,
        com.example.kursovikkmp.favorites.ui.moduleFavorites,
    )
}
