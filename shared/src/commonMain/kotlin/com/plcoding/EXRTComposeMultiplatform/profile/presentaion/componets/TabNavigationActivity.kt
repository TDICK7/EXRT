package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import androidx.compose.material3.NavigationBar
import cafe.adriel.voyager.core.annotation.ExperimentalVoyagerApi
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.plcoding.EXRTComposeMultiplatform.profile.domain.BottomNavigationItem
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileTab

class TabNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Map<String, Any>) {
        super.onCreate(savedInstanceState)

        setContent {
            Content()
        }
    }

    @OptIn(ExperimentalVoyagerApi::class)
    @Composable
    fun Content() {
        TabNavigator(
            ProfileTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(ProfileTab)
                )
            }
        ) { tabNavigator ->
            Scaffold(
                content = {
                    CurrentTab()
                },
                bottomBar = {
                    NavigationBar {
                        TabNavigationItem(ProfileTab)
                    }
                }
            )
        }
    }

    @Composable
    private fun RowScope.TabNavigationItem(tab: Tab) {
        val tabNavigator = LocalTabNavigator.current
        BottomNavigationItem (
            title = "Profile",
            selectedIcon = Icons.Filled.Person,
            unselectedIcon = Icons.Outlined.Person,
            hasNews = false,
        )
    }
}
