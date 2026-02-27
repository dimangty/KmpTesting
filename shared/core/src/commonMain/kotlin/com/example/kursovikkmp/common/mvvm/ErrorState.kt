package com.example.kursovikkmp.common.mvvm

import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.resources.AppColors

sealed class ErrorState {
    data class ApiAlertError(
        val title: String,
        val isCancellable: Boolean = true,
        val positiveButtonText: String = "OK",
        val positiveAction: () -> Unit = {}
    ) : ErrorState() {
        companion object {
            fun getMock() = ApiAlertError(title = "Title")
        }

        val titleState: TextState = TextState.latoSemibold(17, AppColors.black).updateValue(title)
        val positiveState: TextState = TextState.latoSemibold(13, AppColors.primary).updateValue(positiveButtonText)
    }

    data class AlertError(
        val title: String,
        val message: String,
        val isCancellable: Boolean = true,
        val positiveButtonText: String = "OK",
        val positiveAction: () -> Unit = {},
        val negativeButtonText: String = "Cancel",
        val negativeAction: () -> Unit = {}
    ) : ErrorState() {

        companion object {
            fun getMock() = AlertError(title = "Title", message = "Message")
        }

        val titleState: TextState = TextState.latoSemibold(17, AppColors.black).updateValue(title)
        val textState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(message)
        val positiveState: TextState =
            TextState.latoSemibold(15, AppColors.primary).updateValue(positiveButtonText)
        val negativeState: TextState =
            TextState.latoSemibold(15, AppColors.red).updateValue(negativeButtonText)
    }
}