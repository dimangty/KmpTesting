package com.example.kursovikkmp.feature.home

import com.example.kursovikkmp.base.BaseViewModel
import com.example.kursovikkmp.resources.AppResources


class HomeViewModel(): BaseViewModel<HomeState, HomeEvents>() {
    init {
        initScreenData()
    }


    override fun initToolbar() {

    }

    override fun initScreenData() {
        updateState { copy(tabResources = listOf(
            AppResources.strings.scr_news_tab_title,
            AppResources.strings.scr_favorite_tab_title,
            AppResources.strings.scr_recipes_tab_title,
            AppResources.strings.scr_fridge_tab_title
        ))}
    }

    override fun initialState(): HomeState = HomeState.getMock()

    override fun onEvent(event: HomeEvents) {

    }

}
