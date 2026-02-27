package com.example.kursovikkmp

import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.getMock
import com.example.kursovikkmp.resources.AppColors

fun getTextStateMock(text: String): TextState {
    return TextState.latoRegular(14, AppColors.black).getMock(text)
}