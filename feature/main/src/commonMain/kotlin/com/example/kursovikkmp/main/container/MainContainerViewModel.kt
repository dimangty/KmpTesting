package com.example.kursovikkmp.main.container

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.uikit.component.navigationbar.EpsNavigationBarItemState
import com.example.kursovikkmp.uikit.component.navigationbar.EpsNavigationBarState
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.favorites
import kursovikkmp.core.uikit.generated.resources.news
import kotlinx.coroutines.launch

class MainContainerViewModel :
    BaseViewModel<MainContainerUiEvent, MainContainerState>(MainContainerState()) {

    init {
        viewModelScope.launch {
            newsTitle = getString(Res.string.news)
            favoritesTitle = getString(Res.string.favorites)
            updateState { withNavigationBarState(selectedTab) }
        }
    }

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(showBackButton = false)
    }

    override fun initScreenStrings(): suspend MainContainerState.() -> MainContainerState = {
        newsTitle = getString(Res.string.news)
        favoritesTitle = getString(Res.string.favorites)
        withNavigationBarState(selectedTab)
    }

    override fun processUiEvent(event: MainContainerUiEvent) {
        when (event) {
            is MainContainerUiEvent.OnTabSelected -> updateState {
                copy(selectedTab = event.tab).withNavigationBarState(event.tab)
            }
        }
    }

    private fun MainContainerState.withNavigationBarState(tab: MainTab): MainContainerState {
        return copy(
            navigationBarState = EpsNavigationBarState(
                items = listOf(
                    EpsNavigationBarItemState(
                        label = newsTitle,
                        selected = tab == MainTab.News,
                        onClick = { onUiEvent(MainContainerUiEvent.OnTabSelected(MainTab.News)) },
                    ),
                    EpsNavigationBarItemState(
                        label = favoritesTitle,
                        selected = tab == MainTab.Favorites,
                        onClick = { onUiEvent(MainContainerUiEvent.OnTabSelected(MainTab.Favorites)) },
                    ),
                )
            )
        )
    }

    private var newsTitle: String = ""
    private var favoritesTitle: String = ""
}
