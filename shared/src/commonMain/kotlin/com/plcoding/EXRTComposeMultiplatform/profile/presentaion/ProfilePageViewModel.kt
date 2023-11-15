package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProfilePageViewModel: ViewModel() {

    private val _state = MutableStateFlow(ProfileListState(

    ))
    val state = _state.asStateFlow()

    var newProfile: Profile? by mutableStateOf(null)
        private set

    fun onEvent(event: ProfilePageEvent) {

    }
}

private val profile = (1..2).map {
    Profile(
        email = "Trevordick07@outlook.com",
        firstName = "Trevor",
        lastName = "Dick",
        gender = true,
        height = "6'7",
        username = "trevordick07",
        weight = 160,
        workoutTime = 70,
        profilePrivate = true
    )
}

