package com.plcoding.EXRTComposeMultiplatform

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.main.MainScreen
import com.main.MainViewModel
import org.koin.compose.KoinContext
import org.koin.compose.koinInject


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(mainViewModel: MainViewModel = koinInject()) {
    val darkTheme = when (mainViewModel.appTheme.collectAsState().value) {
        1 -> true
        else -> false
    }
    KoinContext {
        MaterialTheme {
            MainScreen()
        }
    }
}



