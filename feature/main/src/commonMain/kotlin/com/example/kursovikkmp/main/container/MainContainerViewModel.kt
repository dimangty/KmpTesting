package com.example.kursovikkmp.main.container

import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState

class MainContainerViewModel :
    BaseViewModel<MainContainerUiEvent, MainContainerState>(MainContainerState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(showBackButton = false)
    }

    override fun processUiEvent(event: MainContainerUiEvent) {
        when (event) {
            is MainContainerUiEvent.OnTabSelected -> updateState { copy(selectedTab = event.tab) }
        }
    }
}
