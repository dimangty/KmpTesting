package com.example.kursovikkmp.mvvm.common.singleclick

import com.example.kursovikkmp.mvvm.common.SingleClickUiEvent
import com.example.kursovikkmp.mvvm.common.UiEvent

interface SingleClickService {
    fun isClickAllowed(event: UiEvent): Boolean
}
