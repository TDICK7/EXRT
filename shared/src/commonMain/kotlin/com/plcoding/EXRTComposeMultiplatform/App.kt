package com.plcoding.EXRTComposeMultiplatform

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard.LeaderboardTab
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileTab


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(darkTheme: Boolean, dynamicColor: Boolean) {
    MaterialTheme {
        TabNavigator(ProfileTab) {
            Scaffold (
                bottomBar = {
                    NavigationBar {
                        TabItem(ProfileTab)
                        TabItem(LeaderboardTab)
                        TabItem(ProfileTab)
                    }
                }
            ) {
                CurrentTab()
            }
        }
    }
}

@Composable
private fun RowScope.TabItem(tab: Tab){
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




