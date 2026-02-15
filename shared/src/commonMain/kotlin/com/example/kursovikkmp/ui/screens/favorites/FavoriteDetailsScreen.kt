package com.example.kursovikkmp.ui.screens.favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsEvents
import com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsState
import com.example.kursovikkmp.feature.favorites.details.FavoriteDetailsViewModel
import com.example.kursovikkmp.ui.components.base.BaseScreen
import com.example.kursovikkmp.ui.components.base.Toolbar
import com.example.kursovikkmp.ui.components.base.VSpacer
import com.example.kursovikkmp.ui.components.buttons.MyButton
import com.example.kursovikkmp.ui.components.text.MyText
import com.example.kursovikkmp.ui.theme.AppShapes
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.koin.core.parameter.parametersOf

data class FavoriteDetailsScreen(val title: String) : Screen {
    @Composable
    override fun Content() {
        val viewModel: FavoriteDetailsViewModel = koinInject(parameters = { parametersOf(title) })
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            FavoriteDetailsScreenView(
                state = state,
                onUiEvent = viewModel::pushEvent
            )
        }
    }
}

@Composable
fun FavoriteDetailsScreenView(
    state: FavoriteDetailsState,
    onUiEvent: (FavoriteDetailsEvents) -> Unit
) {
    Column {
        Toolbar(toolbarState = state.titleBarState)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                state.imageUrl?.let { imageUrl ->
                    Column(modifier = Modifier.clip(AppShapes.rounded)) {
                        KamelImage(
                            resource = asyncPainterResource(imageUrl),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(240.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                VSpacer(16.dp)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    MyText(state = state.dateState)

                    MyText(state = state.titleState, maxLines = 3)
                    MyText(state = state.textState, maxLines = 10)
                }
            }

            MyButton(state = state.openButton) {
                onUiEvent(FavoriteDetailsEvents.OnOpenClicked)
            }
        }
    }
}
