package com.example.kursovikkmp.uikit.component.dialog.toast

import com.example.kursovikkmp.uikit.component.dialog.UiDialogEffect

enum class ToastType { Success, Error }

data class ToastState(
    val type: ToastType = ToastType.Success,
    val message: String = "",
) : UiDialogEffect
