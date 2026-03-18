package com.example.kursovikkmp.feature.profile.tips

import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.TitleBarState

data class KitchenTipsState(
    val heroTitle: String = "",
    val heroDescription: String = "",
    val checklist: List<String> = emptyList(),
    val tipCards: List<KitchenTipCardState> = emptyList(),
    override val titleBarState: TitleBarState = TitleBarState.getMock()
) : BaseViewState

data class KitchenTipCardState(
    val title: String,
    val description: String
)
