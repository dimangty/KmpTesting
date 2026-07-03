package com.example.kursovikkmp.news.ui.newsdetails

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
internal fun NewsDetailsScreen(title: String) {
    val viewModel: NewsDetailsViewModel = koinViewModel { parametersOf(title) }
    val screenState by viewModel.stateFlow.collectAsState()

    BaseScreen(
        lceState = screenState.lceState,
        topBarState = screenState.topBarState,
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        NewsDetailsView(state = screenState.state)
    }
}

@Composable
private fun NewsDetailsView(
    state: NewsDetailsState,
) {
    if (state.article != null) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            EpsText(state = state.titleTextState)
            Spacer(modifier = Modifier.height(8.dp))
            EpsText(state = state.descriptionTextState)
            Spacer(modifier = Modifier.height(8.dp))
            EpsButton(state = state.favoriteButtonState)
        }
    }
}
