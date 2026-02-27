package com.example.kursovikkmp.common.view

import androidx.compose.ui.graphics.Color
import com.example.kursovikkmp.base.DefaultUiEvent
import com.example.kursovikkmp.resources.AppColors
import kursovikkmp.shared.core.generated.resources.Res
import kursovikkmp.shared.core.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

@Suppress("MagicNumber")
data class TitleBarState(
    val title: TextState = TextState.latoMedium(16, AppColors.black),
    val titleResource: StringResource? = null,
    val isNavigateBackVisible: Boolean = false,
    val backIcon: DrawableResource = Res.drawable.ic_titlebar_back,
    val contentColor: Color = AppColors.black,
    val onDefaultUiEvent: (DefaultUiEvent) -> Unit = {}
) {
    companion object {
        fun getMock() = TitleBarState().run {
            copy(
                title = title.getMock("Title bar"),
                isNavigateBackVisible = true,
            )
        }
    }
}