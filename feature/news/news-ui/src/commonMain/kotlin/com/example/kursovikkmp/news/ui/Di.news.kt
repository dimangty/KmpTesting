package com.example.kursovikkmp.news.ui

import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.news.data.moduleNewsData
import com.example.kursovikkmp.news.domain.moduleNewsDomain
import com.example.kursovikkmp.news.ui.newsdetails.NewsDetailsScreen
import com.example.kursovikkmp.news.ui.newsdetails.NewsDetailsViewModel
import com.example.kursovikkmp.news.ui.newslist.NewsListScreen
import com.example.kursovikkmp.news.ui.newslist.NewsListViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val moduleNews = module {
    viewModelOf(::NewsListViewModel)
    viewModelOf(::NewsDetailsViewModel)

    navigation<NavigationAction.NavigateToNewsList> { NewsListScreen() }
    navigation<NavigationAction.NavigateToNewsDetails> { route -> NewsDetailsScreen(route.title) }

    includes(moduleNewsData, moduleNewsDomain)
}
