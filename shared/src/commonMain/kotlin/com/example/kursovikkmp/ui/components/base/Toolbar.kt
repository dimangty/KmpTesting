package com.example.kursovikkmp.ui.components.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.MR
import com.example.kursovikkmp.base.DefaultUiEvent
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.platform.toComposeColor
import com.example.kursovikkmp.platform.toComposePainter
import com.example.kursovikkmp.ui.components.text.MyText

private val ToolbarHeight = 40.dp

@Composable
fun Toolbar(
    modifier: Modifier = Modifier,
    toolbarState: TitleBarState = TitleBarState(),
) {
    ToolbarWithContent(
        onNavigateBackClicked = { toolbarState.onDefaultUiEvent(DefaultUiEvent.OnBackClicked) },
        navigateBackIcon = toolbarState.backIcon,
        modifier = modifier,
        title = toolbarState.title,
        isNavigateBackVisible = toolbarState.isNavigateBackVisible,
        contentColor = toolbarState.contentColor.toComposeColor(),
    )
}

@Composable
fun ToolbarWithContent(
    onNavigateBackClicked: () -> Unit,
    title: TextState,
    contentColor: Color = MR.colors.white.toComposeColor(),
    navigateBackIcon: dev.icerock.moko.resources.ImageResource = MR.images.ic_titlebar_back,
    modifier: Modifier = Modifier,
    isNavigateBackVisible: Boolean = true,
    endContent: @Composable RowScope.() -> Unit = {},
) {
    Column {
        Spacer(
            Modifier
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(Color.Transparent)
        )
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(ToolbarHeight),
            contentAlignment = Alignment.CenterStart,
        ) {
            if (title.value.isNotBlank()) {
                MyText(
                    state = title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 50.dp)
                )
            }

            if (isNavigateBackVisible) {
                IconButton(
                    onClick = {
                        onNavigateBackClicked()
                    },
                    modifier = Modifier.padding(start = 2.dp),
                    content = {
                        Icon(
                            painter = navigateBackIcon.toComposePainter(),
                            contentDescription = null,
                            tint = contentColor,
                        )
                    }
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(horizontal = 2.dp)
            ) {
                endContent()
            }
        }
    }
}
