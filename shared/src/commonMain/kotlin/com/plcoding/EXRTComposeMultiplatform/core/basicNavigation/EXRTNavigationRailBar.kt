package com.plcoding.EXRTComposeMultiplatform.core.basicNavigation

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.plcoding.EXRTComposeMultiplatform.core.util.FilledIcon

@Composable
fun EXRTNavigationRailBar(modifier: Modifier = Modifier, tabNavigator: TabNavigator, navRailItems: List<Tab> ){
    NavigationRail(
        modifier = modifier.fillMaxHeight().alpha(0.95F),
        containerColor = MaterialTheme.colorScheme.surface,
        header = {

        },
        contentColor = MaterialTheme.colorScheme.onSurface,
        ) {
        navRailItems.forEach {  item ->
            val isSelected = tabNavigator.current == item
            NavigationRailItem(
                modifier = Modifier.padding(vertical = 16.dp),
                icon = {
                    item.options.icon?.let {
                        Icon(
                            painter = if (isSelected) {
                                FilledIcon(item)
                            } else {
                              it
                            },
                            contentDescription = item.options.title
                        )
                    }
                },
                label = { Text(text = item.options.title) },
                alwaysShowLabel = true,
                selected = tabNavigator.current == item,
                onClick = { tabNavigator.current == item }
            )
        }
    }
}
