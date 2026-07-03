package com.example.kursovikkmp.favorites.ui.favoritedetails

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButton
import com.example.kursovikkmp.uikit.component.text.EpsText
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
internal fun FavoriteDetailsScreen(title: String) {
    val viewModel: FavoriteDetailsViewModel = koinViewModel { parametersOf(title) }
    val screenState by viewModel.stateFlow.collectAsState()

    BaseScreen(
        lceState = screenState.lceState,
        topBarState = screenState.topBarState,
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        FavoriteDetailsView(state = screenState.state)
    }
}

@Composable
private fun FavoriteDetailsView(
    state: FavoriteDetailsState,
) {
    if (state.article != null) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            EpsText(state = state.titleTextState)
            Spacer(modifier = Modifier.height(8.dp))
            EpsText(state = state.descriptionTextState)
            Spacer(modifier = Modifier.height(8.dp))
            EpsButton(state = state.removeButtonState)
        }
    }
}
