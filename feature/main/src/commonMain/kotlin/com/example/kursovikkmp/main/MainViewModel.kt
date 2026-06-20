package com.example.kursovikkmp.main

import com.example.kursovikkmp.mvvm.BaseViewModel

class MainViewModel : BaseViewModel<MainUiEvent, MainState>(MainState()) {

    override fun processUiEvent(event: MainUiEvent) {
        when (event) {
            MainUiEvent.OnAppUiStarted -> {}
            MainUiEvent.OnAppUiStopped -> {}
        }
    }
}
