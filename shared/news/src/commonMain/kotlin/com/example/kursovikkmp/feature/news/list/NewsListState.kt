package com.example.kursovikkmp.feature.news.list

import androidx.compose.ui.graphics.Color
import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.ButtonData
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.common.view.getMock
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.resources.AppColors
import com.example.kursovikkmp.resources.AppResources

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class NewsListState(
    val newsItems: List<NewsUiState> = listOf(),
    val searchQuery: String = "",
    val searchPlaceholder: String = "",
    val searchPlaceholderResource: StringResource? = null,
    override val titleBarState: TitleBarState = TitleBarState.getMock(),
    val backGroundColor: Color = AppColors.grey,
) : BaseViewState {
    companion object {
        fun getMock() = NewsListState().run {
            copy(
                newsItems = listOf(NewsUiState.getMock(), NewsUiState.getMock(), NewsUiState.getMock(),)
            )
        }
    }
}

data class NewsUiState(
    val id: String = "",
    val title: String = "",
    val text: String = "",
    val date: String = "",
    val imageUrl: String? = "",
    val isFavorite: Boolean = false,
    val cellBackground: Color = AppColors.white,
) {
    val titleState: TextState = TextState.latoSemibold(17, AppColors.black).updateValue(title)
    val textState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(text)
    val dateState: TextState = TextState.latoRegular(13, AppColors.black).updateValue(date)
    val favoriteButton: ButtonState = ButtonState.image(image = if(isFavorite) AppResources.drawable.favorite_on_icon else AppResources.drawable.favorite_off_icon)

    companion object {
        fun getMock() = NewsUiState().run {
            copy(
                title = "title",
                text = "text",
                date = "date",
                imageUrl = "https://cdnstatic.rg.ru/uploads/images/2025/02/25/zagruzhennoe_f42.jpg",
            )
        }
    }
}
