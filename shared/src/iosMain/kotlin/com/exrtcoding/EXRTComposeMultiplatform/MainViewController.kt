package com.exrtcoding.EXRTComposeMultiplatform

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewControler() = ComposeUIViewController {

    val isDarkTheme = UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark

    ExrtApp(
        darkTheme = isDarkTheme,
        dynamicColor = false
    )
}
