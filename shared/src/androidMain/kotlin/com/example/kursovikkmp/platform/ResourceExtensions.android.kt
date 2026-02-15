package com.example.kursovikkmp.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.kursovikkmp.common.view.TextFontState
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.StringResource

@Composable
actual fun ColorResource.toComposeColor(): Color {
    return Color(this.getColor(LocalContext.current))
}

@Composable
actual fun StringResource.toComposeString(): String {
    return this.getString(LocalContext.current)
}

@Composable
actual fun ImageResource.toComposePainter(): Painter {
    return painterResource(id = this.drawableResId)
}

@Composable
actual fun TextFontState.toComposeTextStyle(): TextStyle {
    return TextStyle(
        fontFamily = FontFamily(Font(this.font.fontResourceId)),
        fontSize = this.fontSize.sp,
        lineHeight = this.lineHeight.sp,
    )
}
