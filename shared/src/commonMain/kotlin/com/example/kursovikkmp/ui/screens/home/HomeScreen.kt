package com.example.kursovikkmp.ui.screens.home

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.example.kursovikkmp.feature.home.HomeViewModel
import com.example.kursovikkmp.getPlatform
import com.example.kursovikkmp.ui.screens.favorites.FavoritesListScreen
import com.example.kursovikkmp.ui.screens.fridge.FridgeScreen
import com.example.kursovikkmp.ui.screens.news.NewsListScreen
import com.example.kursovikkmp.ui.screens.recipes.RecipesListScreen

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: HomeViewModel = koinInject()
        val homeState by viewModel.flowState.collectAsState()
        val defaultTabs = listOf("News", "Favorites", "Рецепты", "Холодильник")
        val tabs = if (homeState.tabs.size >= 4) homeState.tabs else defaultTabs

        TabNavigator(NewsTab(tabs[0])) {
            HomeScreenView(tabs = tabs)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenView(
    tabs: List<String>,
    tabItems: List<Tab> = listOf(
        NewsTab(tabs[0]),
        FavoritesTab(tabs[1]),
        RecipesTab(tabs[2]),
        FridgeTab(tabs[3])
    )
) {
    val tabNavigator = LocalTabNavigator.current
    val isIos = remember { getPlatform().name.startsWith("iOS") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(tabNavigator.current.options.title) },
                actions = {
                    IconButton(onClick = {
                        // TODO: Navigate to ProfileScreen
                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "Profile"
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar(
                windowInsets = if (isIos) WindowInsets(0, 0, 0, 0) else NavigationBarDefaults.windowInsets
            ) {
                tabItems.forEach { tab ->
                    TabNavigationItem(tab)
                }
            }
        }
    ) { paddingValues ->
        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            CurrentTab()
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = {
            tab.options.icon?.let { painter ->
                Icon(painter, contentDescription = tab.options.title)
            }
        },
        label = { Text(tab.options.title) }
    )
}

// Tab definitions
data class NewsTab(val label: String) : Tab {
    override val options: TabOptions
        @Composable
        get() = TabOptions(
            index = 0u,
            title = label,
            icon = rememberVectorPainter(Icons.Filled.Home)
        )

    @Composable
    override fun Content() {
        NewsListScreen.Content()
    }
}

data class FavoritesTab(val label: String) : Tab {
    override val options: TabOptions
        @Composable
        get() = TabOptions(
            index = 1u,
            title = label,
            icon = rememberVectorPainter(Icons.Filled.Favorite)
        )

    @Composable
    override fun Content() {
        FavoritesListScreen.Content()
    }
}

data class RecipesTab(val label: String) : Tab {
    override val options: TabOptions
        @Composable
        get() = TabOptions(
            index = 2u,
            title = label,
            icon = rememberVectorPainter(Icons.Filled.Home)
        )

    @Composable
    override fun Content() {
        RecipesListScreen.Content()
    }
}

data class FridgeTab(val label: String) : Tab {
    override val options: TabOptions
        @Composable
        get() = TabOptions(
            index = 3u,
            title = label,
            icon = rememberVectorPainter(Icons.Filled.List)
        )

    @Composable
    override fun Content() {
        FridgeScreen.Content()
    }
}
