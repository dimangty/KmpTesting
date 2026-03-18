package com.example.kursovikkmp.feature.profile.tips

import com.example.kursovikkmp.MR
import com.example.kursovikkmp.base.BaseViewModel
import com.example.kursovikkmp.common.view.updateValue

class KitchenTipsViewModel : BaseViewModel<KitchenTipsState, KitchenTipsEvents>() {

    override fun initToolbar() {
        var titleBar = state.titleBarState.copy()
        titleBar = titleBar.copy(
            title = titleBar.title.updateValue(getString(MR.strings.scr_kitchen_tips_title)),
            isNavigateBackVisible = true,
            onDefaultUiEvent = ::onDefaultUiEvent
        )
        updateState { copy(titleBarState = titleBar) }
    }

    override fun initScreenData() {
        updateState {
            copy(
                heroTitle = "Plan three dinners, not seven",
                heroDescription = "Keep weekday cooking simple: reuse ingredients, prep once, and leave space for leftovers.",
                checklist = listOf(
                    "Choose one dinner you can finish in 20 minutes.",
                    "Repeat one protein in two meals to reduce shopping.",
                    "Leave one evening open for leftovers or delivery."
                ),
                tipCards = listOf(
                    KitchenTipCardState(
                        title = "Sunday reset",
                        description = "Wash herbs, cook one grain, and chop a box of vegetables so weekday meals start halfway done."
                    ),
                    KitchenTipCardState(
                        title = "Fridge first",
                        description = "Move the oldest ingredients to eye level and build tonight's plate around them before opening something new."
                    ),
                    KitchenTipCardState(
                        title = "Easy plate formula",
                        description = "Combine protein, vegetables, sauce, and one crunchy topping to make a fast dinner feel complete."
                    )
                )
            )
        }
    }

    override fun initialState(): KitchenTipsState = KitchenTipsState()

    override fun onEvent(event: KitchenTipsEvents) = Unit
}
