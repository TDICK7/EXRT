package com.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.plcoding.EXRTComposeMultiplatform.core.basicNavigation.EXRTNavigationRailBar
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets.EXRTTab

class MainScreen: Screen {
    @Composable
    override fun Content() {
        //val windowSizeClass = calculateWindowSizeClass()
        //val useNavRail = windowSizeClass
        TabNavigator(
            EXRTTab.ProfileTab,
        ) {
            Row {
                EXRTNavigationRailBar(
                    tabNavigator = it,
                    navRailItems = listOf(
                        EXRTTab.LeaderboardTab,
                        EXRTTab.WorkoutTab,
                        EXRTTab.ProfileTab,
                    )
                )
            }
        }
    }

    @Composable
    private fun RowScope.TabNavigationItem(tab: Tab) {

    }
}
