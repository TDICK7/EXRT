package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object ProfileTab: Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.EmojiEvents)

            return remember {
                TabOptions(
                    index = 0u,
                    title = "Leaderboard",
                    icon = icon
                )
            }
        }
    @Composable
    override fun Content() {
        TabContent()
    }
}
