package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Scale
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets.TabContent

object ProfieTab: Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Profile Tab"
            val icon = rememberVectorPainter(Icons.Outlined.Scale)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}
