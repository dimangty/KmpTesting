package com.example.kursovikkmp.uikit.component.articlecard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.uikit.component.text.EpsText
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.text.EpsTextStyle

@Composable
fun EpsArticleCard(state: EpsArticleCardState) {
    val modifier = if (state.onClick != null) {
        Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { state.onClick.invoke() }
    } else {
        Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    }

    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp)) {
            EpsText(
                state = EpsTextState(
                    text = state.title,
                    style = EpsTextStyle.TitleMedium,
                )
            )
            if (state.subtitle.isNotEmpty()) {
                EpsText(state = EpsTextState(text = state.subtitle))
            }
        }
    }
}
