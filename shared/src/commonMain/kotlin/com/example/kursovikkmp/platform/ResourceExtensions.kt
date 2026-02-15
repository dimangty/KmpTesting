package com.example.kursovikkmp.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import com.example.kursovikkmp.common.view.TextFontState
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.StringResource

/**
 * Convert Moko ColorResource to Compose Color
 */
@Composable
expect fun ColorResource.toComposeColor(): Color

/**
 * Convert Moko StringResource to String
 */
@Composable
expect fun StringResource.toComposeString(): String

/**
 * Convert Moko ImageResource to Compose Painter
 */
@Composable
expect fun ImageResource.toComposePainter(): Painter

/**
 * Convert TextFontState to Compose TextStyle
 */
@Composable
expect fun TextFontState.toComposeTextStyle(): TextStyle
