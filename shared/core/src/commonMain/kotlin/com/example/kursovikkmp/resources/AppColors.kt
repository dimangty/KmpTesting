package com.example.kursovikkmp.resources

import androidx.compose.ui.graphics.Color

@Suppress("MagicNumber")
object AppColors {
    val white = Color(0xFFFFFFFF)
    val black = Color(0x000000FF)
    val primary = Color(0x6699FFFF)

    val loaderScreenBackground = Color(0x00000080)
    val loaderOpaqueScreenBackground = Color(0xFFFFFFFF)
    val loaderBackground = Color(0xFFFFFF33)
    val loaderOpaqueBackground = Color(0x87878733)
    val loader = Color(0xFFFFFFFF)
    val loaderOpaque = Color(0x878787FF)
    val grey = Color(0xD9D9D9FF)
    val lightGrey = Color(0xF3F4F6FF)
    val red = Color(0xFF0000FF)

    // Backward-compatible names used by legacy call sites.
    val loader_screen_background: Color get() = loaderScreenBackground
    val loader_opaque_screen_background: Color get() = loaderOpaqueScreenBackground
    val loader_background: Color get() = loaderBackground
    val loader_opaque_background: Color get() = loaderOpaqueBackground
    val loader_opaque: Color get() = loaderOpaque
    val light_grey: Color get() = lightGrey
}
