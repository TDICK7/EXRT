package com.plcoding.EXRTComposeMultiplatform.core.util

import androidx.compose.runtime.Composable

@Composable
expect fun ProfileTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)
