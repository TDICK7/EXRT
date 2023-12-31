package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfilePageScreen

object LeaderboardTab : Tab {
    @Composable
    override fun Content() {
        ProfilePageScreen()
    }
    override val options: TabOptions
        @Composable
        get() {
            val index: UShort = 1u
            val icon = rememberVectorPainter(Icons.Default.EmojiEvents)
            val title = "Leaderboard"

            return TabOptions(
                index, title, icon
            )
        }
}
