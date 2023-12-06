package com.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.exrtcoding.EXRTComposeMultiplatform.ExrtApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExrtApp(
                darkTheme = false,
                dynamicColor = true
            )
        }
    }
}
