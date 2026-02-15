package com.example.kursovikkmp.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.core.BaseScreen
import com.example.kursovikkmp.feature.fridge.list.FridgeEvents
import com.example.kursovikkmp.feature.fridge.list.FridgeProductUiState
import com.example.kursovikkmp.feature.fridge.list.FridgeRecommendedRecipeUiState
import com.example.kursovikkmp.feature.fridge.list.FridgeState
import com.example.kursovikkmp.feature.fridge.list.FridgeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun FridgeScreen() {
    val viewModel: FridgeViewModel = koinViewModel()
    val state by viewModel.flowState.collectAsState()
    val lceState by viewModel.lceState.collectAsState()

    BaseScreen(
        lceState = lceState,
        onDefaultUiEvent = viewModel::onDefaultUiEvent
    ) {
        FridgeScreenView(state = state, onUiEvent = viewModel::pushEvent)
    }
}

@Composable
private fun FridgeScreenView(
    state: FridgeState,
    onUiEvent: (FridgeEvents) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        item {
            Text(text = state.productsTitleState.value, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(state.productsItems) { item ->
            FridgeProductItem(item = item) {
                onUiEvent(FridgeEvents.OnProductClicked(item.id))
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { onUiEvent(FridgeEvents.OnRecommendRecipesClicked) },
                enabled = state.isRecommendButtonEnabled,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(state.recommendButtonTitle)
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        if (state.hasRecommendationsRequest) {
            item {
                Text(text = state.recommendationsTitleState.value, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
            }

            if (state.recommendationsItems.isEmpty()) {
                item {
                    Text(text = state.emptyRecommendationsState.value)
                    Spacer(modifier = Modifier.height(8.dp))
                    TextButton(onClick = { onUiEvent(FridgeEvents.OnRetryClicked) }) {
                        Text("Повторить")
                    }
                }
            } else {
                items(state.recommendationsItems) { recipe ->
                    FridgeRecipeCard(recipe = recipe) {
                        onUiEvent(FridgeEvents.OnRecipeClicked(recipe.id))
                    }
                }
            }
        }
    }
}

@Composable
private fun FridgeProductItem(
    item: FridgeProductUiState,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = item.isSelected, onCheckedChange = { onClick() })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = item.name)
    }
}

@Composable
private fun FridgeRecipeCard(
    recipe: FridgeRecommendedRecipeUiState,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            if (recipe.imageUrl.isNotBlank()) {
                AsyncImage(
                    model = recipe.imageUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
            Text(text = recipe.titleState.value, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = recipe.descriptionState.value, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = recipe.durationState.value, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = recipe.matchedState.value, style = MaterialTheme.typography.bodySmall)
        }
    }
}
