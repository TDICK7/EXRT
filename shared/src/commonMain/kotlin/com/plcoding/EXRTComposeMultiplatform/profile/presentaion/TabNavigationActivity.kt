package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.annotation.ExperimentalVoyagerApi
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.plcoding.EXRTComposeMultiplatform.profile.domain.BottomNavigationItem
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.tabs.LeaderboardTab
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.tabs.ProfileTab
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.tabs.WorkoutTab

class TabNavigationActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Content()
        }
    }

    @OptIn(ExperimentalVoyagerApi::class, ExperimentalMaterial3Api::class)
    @Composable
    fun Content() {
        TabNavigator(
            ProfileTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(ProfileTab, LeaderboardTab, WorkoutTab)
                )
            }
        ) { tabNavigator ->
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = tabNavigator.current.options.title) }
                    )
                },
                content = {
                    CurrentTab()
                },
                bottomBar = {
                  BottomAppBar {
                      TabNavigationItem(ProfileTab)
                  }
                }
            )
        }
    }

    @Composable
    private fun RowScope.TabNavigationItem(tab: Tab) {
        val tabNavigator = LocalTabNavigator.current

        BottomNavigationItem(
            title = "BottomAppItem",
            hasNews = true,
            selectedIcon = tabNavigator.current.key == tab.key,
        )
    }
}
