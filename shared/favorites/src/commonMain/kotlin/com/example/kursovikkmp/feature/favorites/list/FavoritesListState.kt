package com.example.kursovikkmp.feature.favorites.list

import androidx.compose.ui.graphics.Color
import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.feature.news.list.NewsUiState
import com.example.kursovikkmp.resources.AppColors
import com.example.kursovikkmp.resources.AppResources


data class FavoritesListState(val favoritesItems: List<FavoriteUiState> = listOf(),
                              override val titleBarState: TitleBarState = TitleBarState.getMock(),
                              val backGroundColor: Color = AppColors.grey) : BaseViewState {
    companion object {
        fun getMock() = FavoritesListState().run {
            copy(
                favoritesItems = listOf()
            )
        }
    }
}


data class FavoriteUiState(
    val id: String = "",
    val title: String = "",
    val text: String = "",
    val date: String = "",
    val imageUrl: String? = "",
    val favorite: Boolean = false,
    val cellBackground: Color = AppColors.white,
) {
    val titleState: TextState = TextState.latoSemibold(17, AppColors.black).updateValue(title)
    val textState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(text)
    val dateState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(date)
    val favoriteButton: ButtonState = ButtonState.image(image = AppResources.drawable.favorite_on_icon)

    companion object {
        fun getMock() = FavoriteUiState().run {
            copy(
                title = "title",
                text = "text",
                date = "1 march",
                imageUrl = "https://cdnstatic.rg.ru/uploads/images/2025/02/25/zagruzhennoe_f42.jpg",
            )
        }
    }
}