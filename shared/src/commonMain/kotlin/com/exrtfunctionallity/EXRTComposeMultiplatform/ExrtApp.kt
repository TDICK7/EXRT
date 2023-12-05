package com.exrtfunctionallity.EXRTComposeMultiplatform

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.exrtfunctionallity.EXRTComposeMultiplatform.main.MainScreen
import org.koin.compose.KoinContext


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExrtApp(darkTheme: Boolean, dynamicColor: Boolean) {

    KoinContext {
        MainScreen()
    }
}





