package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object ProfileTab : Tab {
    @Composable
    override fun Content() {
        LazyVerticalGridDemo()
    }
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
}
