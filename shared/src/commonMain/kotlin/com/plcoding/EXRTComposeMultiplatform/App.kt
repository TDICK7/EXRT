package com.plcoding.EXRTComposeMultiplatform
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.ProfilePageScreen
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.ProfilePageViewModel
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory


@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    val viewModel = getViewModel(
        key = "Profile-page-screen",
        factory = viewModelFactory {
            ProfilePageViewModel()
        }
    )
    val state by viewModel.state.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        ProfilePageScreen(
            state = state,
            newProfile = viewModel.newProfile,
            onEvent = viewModel::onEvent
        )
    }
}



