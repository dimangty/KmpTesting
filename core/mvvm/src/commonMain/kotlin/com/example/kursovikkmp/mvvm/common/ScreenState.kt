package com.example.kursovikkmp.mvvm.common

import com.example.kursovikkmp.common.device.OsType
import com.example.kursovikkmp.uikit.component.fullscreenerror.EpsFullscreenErrorState
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState

data class ScreenState<T>(
    val state: T,
    val topBarState: EpsTopBarState = EpsTopBarState(),
    val lceState: LceState = LceState(),
)

data class LceState(
    val isUiInitialized: Boolean = false,
    val isLoading: Boolean = false,
    val isRootScreen: Boolean = false,
    val osType: OsType = OsType.Android,
    val errorState: EpsFullscreenErrorState? = null,
)
