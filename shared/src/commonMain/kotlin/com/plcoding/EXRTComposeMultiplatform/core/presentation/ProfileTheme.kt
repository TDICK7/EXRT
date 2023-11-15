package com.plcoding.EXRTComposeMultiplatform.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun ProfileTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)
