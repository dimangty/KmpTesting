package com.example.kursovikkmp.uikit.component.text

import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

data class EpsTextState(
    val text: String = "",
    val style: EpsTextStyle = EpsTextStyle.BodyMedium,
    val color: Long? = null,
    val onClick: (() -> Unit)? = null,
)

enum class EpsTextStyle {
    BodyMedium,
    BodyLarge,
    TitleMedium,
    HeadlineMedium,
}

@Composable
fun EpsText(state: EpsTextState) {
    val modifier = if (state.onClick != null) {
        Modifier.clickable { state.onClick.invoke() }
    } else {
        Modifier
    }
    val textStyle = when (state.style) {
        EpsTextStyle.BodyMedium -> MaterialTheme.typography.bodyMedium
        EpsTextStyle.BodyLarge -> MaterialTheme.typography.bodyLarge
        EpsTextStyle.TitleMedium -> MaterialTheme.typography.titleMedium
        EpsTextStyle.HeadlineMedium -> MaterialTheme.typography.headlineMedium
    }

    Text(
        text = state.text,
        modifier = modifier,
        style = textStyle,
        color = state.color?.let(::Color) ?: Color.Unspecified,
    )
}
