package com.exrtfunctionallity.EXRTComposeMultiplatform.core.presentation.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DirectionsBike
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab

@Composable

fun FilledIcon(item: Tab) = when (item.options.index) {
    (0u).toUShort() -> rememberVectorPainter(Icons.Outlined.Person)
    (1u).toUShort() -> rememberVectorPainter(Icons.Outlined.EmojiEvents)
    (2u).toUShort() -> rememberVectorPainter(Icons.Outlined.DirectionsBike)
    else -> rememberVectorPainter(Icons.Outlined.Person)
}
