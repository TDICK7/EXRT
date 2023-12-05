package com.exrtfunctionallity.EXRTComposeMultiplatform.core.componets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.EmojiEvents
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Scale
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.exrtfunctionallity.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileScreen

internal sealed class EXRTTab {
    internal object ProfileTab : Tab {
        @Composable
        override fun Content() {
            ProfileScreen()
        }

        override val options: TabOptions
            @Composable
            get() {
                val title = "Home"
                val icon = rememberVectorPainter(Icons.Rounded.Person)

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }
    }

    internal object LeaderboardTab : Tab {
        @Composable
        override fun Content() {

        }

        override val options: TabOptions
            @Composable
            get() {
                val title = "Leaderboard"
                val icon = rememberVectorPainter(Icons.Rounded.EmojiEvents)

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }
    }

    internal object WorkoutTab : Tab {
        @Composable
        override fun Content() {
            ProfileScreen()
        }

        override val options: TabOptions
            @Composable
            get() {
                val title = "Home"
                val icon = rememberVectorPainter(Icons.Rounded.Scale)

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }
    }
}
