package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.lifecycle.LifecycleEffect
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.transitions.SlideTransition
import co.touchlab.kermit.Logger
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.BasicNavigationScreen
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileTab

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Tab.TabContent() {
    val tabTitle = options.title

    LifecycleEffect(
        onStarted = { Logger.d("Navigator") },
        onDisposed = { Logger.d("Navigator") }
    )

    Navigator(BasicNavigationScreen(index = 0)) { navigator ->
        SlideTransition(navigator) { screen ->
            Column {
                InnerTabNavigation()
                screen.Content()
                Logger.d("Navigator")
            }
        }
    }
}

@Composable
private fun InnerTabNavigation() {
    Row(
        modifier = Modifier.padding(16.dp)
    ) {
        TabNavigationButton(ProfileTab)
        Spacer(modifier = Modifier.weight(.05f))
    }
}

@Composable
private fun RowScope.TabNavigationButton(
    tab: Tab
) {
    val tabNavigator = LocalTabNavigator.current

    Button(
        enabled = tabNavigator.current.key != tab.key,
        onClick = { tabNavigator.current = tab },
        modifier = Modifier.weight(1f)
    ) {
        Text(text = tab.options.title)
    }
}
