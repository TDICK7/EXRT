package com.exrtfunctionallity.EXRTComposeMultiplatform.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.exrtfunctionallity.EXRTComposeMultiplatform.core.componets.EXRTTab
import com.exrtfunctionallity.EXRTComposeMultiplatform.core.presentation.utils.FilledIcon

class MainScreen : Screen {
    @Composable
    override fun Content() {
        TabNavigator(
            EXRTTab.ProfileTab,
        ) {
            val tabNavigator = LocalTabNavigator.current
                Scaffold(
                    content = { innerPadding ->
                        Box(
                            modifier = Modifier
                                .padding(innerPadding),
                        ) {
                            CurrentScreen()
                        }
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    bottomBar = {
                        BottomAppBar(
                            contentColor = MaterialTheme.colorScheme.background,
                        ) {
                            TabNavigationItem(EXRTTab.ProfileTab)
                            TabNavigationItem(EXRTTab.WorkoutTab)
                            TabNavigationItem(EXRTTab.LeaderboardTab)
                        }
                    },
                )
            }
        }
    }



@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    val isSelected = tabNavigator.current == tab

    NavigationBarItem(
        modifier = Modifier.offset(
            x = when (tab.options.index) {
                (0u).toUShort() -> 0.dp
                (1u).toUShort() -> (-24).dp
                (2u).toUShort() -> 24.dp
                else -> 0.dp
            },
        ),
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = {
            tab.options.icon?.let {
                Icon(
                    painter = if (isSelected) {
                        FilledIcon(tab)
                    } else {
                        it
                    },
                    contentDescription = tab.options.title,
                    tint = if (isSelected) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.onBackground
                    },
                )
            }
        },
    )
}
