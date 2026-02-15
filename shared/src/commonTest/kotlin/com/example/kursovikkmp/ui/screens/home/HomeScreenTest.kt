package com.example.kursovikkmp.ui.screens.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import kotlin.test.Test
import kotlin.test.Ignore

@Ignore
class HomeScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun tabSwitch_changesDisplayedContent() = runComposeUiTest {
        val labels = listOf("News", "Favorites", "Recipes", "Fridge")
        val tabs = labels.map { FakeTab(it) }

        setContent {
            TabNavigator(tabs.first()) {
                HomeScreenView(tabs = labels, tabItems = tabs)
            }
        }

        onNodeWithText("Fake-News").assertExists()
        onNodeWithText("Favorites").performClick()
        onNodeWithText("Fake-Favorites").assertExists()
    }
}

private data class FakeTab(private val label: String) : Tab {
    override val options: TabOptions
        @Composable
        get() = TabOptions(
            index = label.hashCode().toUShort(),
            title = label,
            icon = null
        )

    @Composable
    override fun Content() {
        Text("Fake-$label")
    }
}
