package com.example.kursovikkmp.feature.recipes.list

import androidx.compose.ui.graphics.Color
import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.resources.AppColors

data class RecipesListState(
    val recipesItems: List<RecipeUiState> = listOf(),
    override val titleBarState: TitleBarState = TitleBarState.getMock(),
    val backGroundColor: Color = AppColors.grey
) : BaseViewState {
    companion object {
        fun getMock() = RecipesListState(
            recipesItems = listOf(
                RecipeUiState.getMock(),
                RecipeUiState.getMock().copy(id = "2", title = "Том Ям")
            )
        )
    }
}

data class RecipeUiState(
    val id: String = "",
    val title: String = "",
    val text: String = "",
    val duration: String = "",
    val imageUrl: String = "",
    val cellBackground: Color = AppColors.white
) {
    val titleState: TextState = TextState.latoSemibold(17, AppColors.black).updateValue(title)
    val textState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(text)
    val durationState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(duration)

    companion object {
        fun getMock() = RecipeUiState(
            id = "1",
            title = "Паста Карбонара",
            text = "Классическая паста с беконом и сыром.",
            duration = "⏱ 25 мин",
            imageUrl = "https://images.unsplash.com/photo-1608756687911-aa1599ab0386"
        )
    }
}
