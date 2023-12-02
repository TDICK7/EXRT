package com.exrtcoding.exrtcomposemultiplatform

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.exrtcoding.exrtcomposemultiplatform.core.componets.ExrtBottomNavigationBar
import com.exrtcoding.exrtcomposemultiplatform.core.componets.TabItem


@Composable
fun App(darkTheme: Boolean, dynamicColor: Boolean) {
    MaterialTheme {
        TabNavigator(ExrtBottomNavigationBar.ProfileTab) {
            Scaffold (
                bottomBar = {
                    NavigationBar {
                        TabItem(ExrtBottomNavigationBar.LeaderboardTab)
                        TabItem(ExrtBottomNavigationBar.WorkoutTab)
                        TabItem(ExrtBottomNavigationBar.ProfileTab)
                    }
                }
            ) {
                CurrentTab()
            }
        }
    }
}




