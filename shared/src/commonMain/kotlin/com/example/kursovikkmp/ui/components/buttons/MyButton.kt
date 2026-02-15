package com.example.kursovikkmp.ui.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.common.view.ButtonData
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.platform.toComposeColor
import com.example.kursovikkmp.ui.components.text.MyText
import com.example.kursovikkmp.ui.theme.AppShapes

@Composable
fun MyButton(
    state: ButtonState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    when (state.data) {
        is ButtonData.PrimaryButton -> {
            PrimaryButton(
                state = state,
                modifier = modifier,
                onClick = onClick,
            )
        }
        is ButtonData.ImageButton -> {
            ImageButton(
                state = state,
                modifier = modifier,
                onClick = onClick,
            )
        }
    }
}

@Composable
private fun PrimaryButton(
    state: ButtonState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp)
            .clip(AppShapes.primary)
            .background(
                color = if (state.coloredState == ButtonData.ColoredState.Colored) {
                    state.backgroundColor
                        .toComposeColor()
                        .copy(
                            alpha = if (state.isEnabled) 1f else 0.5f
                        )
                } else {
                    state.backgroundColor.toComposeColor()
                }
            )
            .clickable(
                enabled = state.isEnabled,
                onClick = onClick
            )
    ) {
        MyText(state = state.textState)
    }
}

@Composable
private fun ImageButton(
    state: ButtonState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Box(
        modifier = modifier.clickable {
            onClick()
        }
    ) {
        MyText(
            state = state.textState,
            applyDisabledAlpha = !state.isEnabled,
        )
    }
}
