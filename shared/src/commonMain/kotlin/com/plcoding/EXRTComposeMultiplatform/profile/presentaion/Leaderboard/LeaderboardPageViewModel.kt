package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.model.ScreenModel
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LeaderboardPageViewModel: ScreenModel {
    private val _state = MutableStateFlow(
        LeaderboardListState(
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
        id = 123,
        email = "Trevordick07@outlook.com",
        firstName = "Trevor",
        lastName = "Dick",
        gender = "Male",
        height = "6'7",
        username = "trevordick07",
        weight = 160,
        workoutTime = 70,
        profilePrivate = true,
        photoBytes = null
    )
}

