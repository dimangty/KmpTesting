package com.example.kursovikkmp.uikit.component.navigationbar

data class EpsNavigationBarItemState(
    val label: String = "",
    val selected: Boolean = false,
    val onClick: (() -> Unit)? = null,
)

data class EpsNavigationBarState(
    val items: List<EpsNavigationBarItemState> = emptyList(),
)
