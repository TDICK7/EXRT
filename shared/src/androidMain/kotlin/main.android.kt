package com.plcoding.EXRTComposeMultiplatform

import App
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = App()
