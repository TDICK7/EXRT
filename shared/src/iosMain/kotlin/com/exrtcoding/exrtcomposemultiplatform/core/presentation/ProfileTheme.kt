package com.exrtcoding.exrtcomposemultiplatform.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.exrtcoding.contactscomposemultiplatform.ui.theme.DarkColorScheme
import com.exrtcoding.contactscomposemultiplatform.ui.theme.LightColorScheme
import com.exrtcoding.contactscomposemultiplatform.ui.theme.Typography

@Composable
actual fun ProfileTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}
