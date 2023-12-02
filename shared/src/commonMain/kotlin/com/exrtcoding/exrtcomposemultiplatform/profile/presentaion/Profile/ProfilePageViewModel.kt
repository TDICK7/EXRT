package com.exrtcoding.exrtcomposemultiplatform.profile.presentaion.Profile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.exrtcoding.exrtcomposemultiplatform.profile.domain.Profile
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProfilePageViewModel: ViewModel() {
    private val _state = MutableStateFlow(
        ProfilePageState(
            profile = profile
        )
    )

    val state = _state.asStateFlow()
    var newProfile: Profile? by mutableStateOf(null)
    private set

    fun onEvent(event: ProfilePageEvent){

    }
}

private val profile = Profile(
        firstName = "Trevor",
        lastName =  "Dick",
        email = "trevordick07@outlook.com",
        username = "trevordick07",
        workoutTime = 70,
        gender = true,
        height = "6'1",
        weight = 160,
        photoBytes = null
)
