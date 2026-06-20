package com.example.kursovikkmp.main.container

enum class MainTab {
    News,
    Favorites,
}

data class MainContainerState(
    val selectedTab: MainTab = MainTab.News,
)
