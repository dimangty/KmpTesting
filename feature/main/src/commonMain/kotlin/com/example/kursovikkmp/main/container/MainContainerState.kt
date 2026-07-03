package com.example.kursovikkmp.main.container

import com.example.kursovikkmp.uikit.component.navigationbar.EpsNavigationBarState

enum class MainTab {
    News,
    Favorites,
}

data class MainContainerState(
    val selectedTab: MainTab = MainTab.News,
    val navigationBarState: EpsNavigationBarState = EpsNavigationBarState(),
)
