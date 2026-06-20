package com.example.kursovikkmp.uikit.component.image

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage

@Composable
fun EpsImage(state: EpsImageState) {
    AsyncImage(
        model = state.url,
        contentDescription = state.contentDescription,
        modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f),
        contentScale = ContentScale.Crop,
    )
}
