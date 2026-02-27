package com.example.core

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.resources.AppColors
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
fun MyText(
    state: TextState,
    modifier: Modifier = Modifier,
    iconStartModifier: Modifier = Modifier,
    iconEndModifier: Modifier = Modifier,
    maxLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    textAlign: TextAlign? = null,
    letterSpacing: Float = 0.0f,
    applyDisabledAlpha: Boolean = false,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val iconStart = state.iconStart
        if (iconStart != null) {
            Icon(
                painter = painterResource(iconStart),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .then(iconStartModifier),
                tint = if (state.overrideIconsTint) {
                    state.color.copy(
                        alpha = if (applyDisabledAlpha) 0.5f else 1f
                    )
                } else {
                    Color.Unspecified
                },
            )
        }

        Text(
            text = state.value,
            color = state.color.copy(
                alpha = if (applyDisabledAlpha) 0.5f else 1f
            ),
            letterSpacing = TextUnit(letterSpacing, TextUnitType.Sp),
            maxLines = maxLines,
            overflow = overflow,
            style = androidx.compose.ui.text.TextStyle(
                fontFamily = FontFamily(Font(state.fontState.font)),
                fontSize = state.fontState.fontSize.sp,
                lineHeight = state.fontState.lineHeight.sp,
            ),
            textAlign = textAlign,
        )

        val iconEnd = state.iconEnd
        if (iconEnd != null) {
            Icon(
                painter = painterResource(iconEnd),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = if (state.value.isNotEmpty()) 4.dp else 0.dp)
                    .then(iconEndModifier),
                tint = if (state.overrideIconsTint) {
                    state.color.copy(
                        alpha = if (applyDisabledAlpha) 0.5f else 1f
                    )
                } else {
                    Color.Unspecified
                },
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
@Composable
private fun MyTextPreview() {
    MaterialTheme  {
        MyText(
            state = TextState.latoMedium(14, AppColors.black).updateValue("Text"),
        )
    }
}