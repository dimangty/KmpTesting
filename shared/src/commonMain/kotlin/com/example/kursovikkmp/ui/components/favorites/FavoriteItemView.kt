package com.example.kursovikkmp.ui.components.favorites

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.feature.favorites.list.FavoriteUiState
import com.example.kursovikkmp.platform.toComposeColor
import com.example.kursovikkmp.ui.components.buttons.MyButton
import com.example.kursovikkmp.ui.components.text.MyText
import com.example.kursovikkmp.ui.theme.AppShapes
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun FavoriteItemView(
    article: FavoriteUiState,
    onClicked: (String) -> Unit,
    onFavorite: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(AppShapes.rounded)
            .clickable { onClicked(article.title) },
        colors = CardDefaults.cardColors(
            containerColor = article.cellBackground.toComposeColor(),
            contentColor = Color.Gray
        )
    ) {
        Column(
            modifier = Modifier
                .clip(AppShapes.rounded)
        ) {
            KamelImage(
                resource = asyncPainterResource(article.imageUrl ?: ""),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(132.dp),
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MyText(state = article.dateState)
                    MyButton(
                        modifier = Modifier,
                        onClick = { onFavorite(article.title) },
                        state = article.favoriteButton
                    )
                }
                MyText(state = article.titleState)
            }
        }
    }
}
