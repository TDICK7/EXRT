package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard.LeaderboardScreen
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileScreen
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Workout.WorkoutScreen

internal sealed class EXRTTab {
    internal object ProfileTab : Tab {
        override val options: TabOptions
            @Composable
            get() {
                val index: UShort = 0u
                val icon = rememberVectorPainter(Icons.Default.Person)
                val title = "Profile"

                return TabOptions(
                    index, title, icon
                )
            }

        @Composable
        override fun Content() {
            ProfileScreen()
        }
    }

    internal object WorkoutTab : Tab {
        override val options: TabOptions
            @Composable
            get() {
                val index: UShort = 0u
                val icon = rememberVectorPainter(Icons.Default.Person)
                val title = "Workout"

                return TabOptions(
                    index, title, icon
                )
            }

        @Composable
        override fun Content() {
          WorkoutScreen()
        }
    }
    internal object LeaderboardTab : Tab {
        override val options: TabOptions
            @Composable
            get() {
                val index: UShort = 0u
                val icon = rememberVectorPainter(Icons.Default.Person)
                val title = "Leaderboard"

                return TabOptions(
                    index, title, icon
                )
            }

        @Composable
        override fun Content() {
            LeaderboardScreen()
        }
    }
}



