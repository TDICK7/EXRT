package com.exrtcoding.exrtcomposemultiplatform.core.componets

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.exrtcoding.exrtcomposemultiplatform.profile.presentaion.Profile.ProfilePageScreen

internal sealed class ExrtBottomNavigationBar() {
    internal object ProfileTab : Tab {
        override val options: TabOptions
        @Composable
        get() {
            val title = "Profile"
            val icon = rememberVectorPainter(Icons.Filled.Person)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon,
                )
            }
        }

        @Composable
        override fun Content() {
            ProfilePageScreen()
        }
    }

    internal object LeaderboardTab : Tab {
        override val options: TabOptions
            @Composable
            get() {
                val title = "Leaderboard"
                val icon = rememberVectorPainter(Icons.Filled.EmojiEvents)

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            ProfilePageScreen()
        }
    }
    internal object WorkoutTab : Tab {
        override val options: TabOptions
            @Composable
            get() {
                val title = "Workout"
                val icon = rememberVectorPainter(Icons.Filled.DirectionsRun)

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            ProfilePageScreen()
        }
    }
}

@Composable
fun RowScope.TabItem(tab: Tab){
    val tabNavigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = {
            tabNavigator.current = tab
        },
        icon = {
            tab.options.icon?.let { painter ->
                Icon(painter, contentDescription = tab.options.title)
            }
        }
    )
}
