package com.example.kursovikkmp.feature.home

import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.resources.AppResources

import org.jetbrains.compose.resources.StringResource

data class HomeState(val tabResources: List<StringResource> = listOf(),
                     override val titleBarState: TitleBarState = TitleBarState.getMock()) : BaseViewState {
    companion object {
        fun getMock() = HomeState().run {
            copy(
                tabResources = listOf(
                    AppResources.strings.scr_news_tab_title,
                    AppResources.strings.scr_favorite_tab_title,
                    AppResources.strings.scr_recipes_tab_title,
                    AppResources.strings.scr_fridge_tab_title
                )
            )
        }
    }
}
