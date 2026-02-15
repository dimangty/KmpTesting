package com.example.kursovikkmp.ui.screens.recipes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.recipes.list.RecipeUiState
import com.example.kursovikkmp.feature.recipes.list.RecipesListEvents
import com.example.kursovikkmp.feature.recipes.list.RecipesListState
import com.example.kursovikkmp.feature.recipes.list.RecipesListViewModel
import com.example.kursovikkmp.ui.components.base.BaseScreen
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

object RecipesListScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: RecipesListViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            RecipesListScreenView(state = state, onUiEvent = viewModel::pushEvent)
        }
    }
}

@Composable
fun RecipesListScreenView(
    state: RecipesListState,
    onUiEvent: (RecipesListEvents) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
            items(state.recipesItems) { item ->
                RecipeItemView(item) { recipeId ->
                    onUiEvent(RecipesListEvents.OnItemClicked(recipeId))
                }
            }
            item {
                if (state.recipesItems.isEmpty()) {
                    TextButton(onClick = {
                        onUiEvent(RecipesListEvents.OnRetryClicked)
                    }) {
                        Text("Повторить")
                    }
                }
            }
        }
    }
}

@Composable
private fun RecipeItemView(item: RecipeUiState, onClicked: (String) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .clickable { onClicked(item.id) },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            if (item.imageUrl.isNotBlank()) {
                KamelImage(
                    resource = asyncPainterResource(item.imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
            Text(text = item.title)
            Text(text = item.text, modifier = Modifier.padding(top = 8.dp))
            Text(text = item.duration, modifier = Modifier.padding(top = 8.dp))
        }
    }
}
