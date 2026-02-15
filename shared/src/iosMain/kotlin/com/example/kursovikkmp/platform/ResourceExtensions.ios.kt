package com.example.kursovikkmp.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.kursovikkmp.common.view.TextFontState
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
actual fun ColorResource.toComposeColor(): Color {
    return colorResource(this)
}

@Composable
actual fun StringResource.toComposeString(): String {
    return stringResource(this)
}

@Composable
actual fun ImageResource.toComposePainter(): Painter {
    return painterResource(this)
}

@Composable
actual fun TextFontState.toComposeTextStyle(): TextStyle {
    return TextStyle(
        fontFamily = FontFamily.Default, // iOS will use system font for now
        fontSize = this.fontSize.sp,
        lineHeight = this.lineHeight.sp,
    )
}
