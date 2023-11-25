package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LeaderboardPageViewModel: ViewModel() {
    private val _state = MutableStateFlow(LeaderboardListState(
        profiles = profiles
        )
    )

    val state = _state.asStateFlow()
    var newProfile: Profile? by mutableStateOf(null)
        private set

    fun onEvent(event: LeaderboardPageEvent) {

    }
}

private val profiles = (1..20).map {
    Profile(
        email = "Trevordick07@outlook.com",
        firstName = "Trevor",
        lastName = "Dick",
        gender = true,
        height = "6'7",
        username = "trevordick07",
        weight = 160,
        workoutTime = 70,
        profilePrivate = true,
        photoBytes = null
    )
}

