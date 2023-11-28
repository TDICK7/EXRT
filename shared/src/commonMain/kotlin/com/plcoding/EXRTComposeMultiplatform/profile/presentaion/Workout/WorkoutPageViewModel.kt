package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Workout

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import com.plcoding.EXRTComposeMultiplatform.profile.domain.WorkoutData
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfilePageEvent
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class WorkoutPageViewModel: ViewModel() {
    private val _state = MutableStateFlow(
        WorkoutPageState (
            workout = workout
        )
    )
    val state = _state.asStateFlow()
    var newProfile: Profile? by mutableStateOf(null)
        private set

    fun onEvent(event: ProfilePageEvent){

    }
}

private val workout = WorkoutData(
        sets = 3,
        reps = 15,
        workoutTime = 70,
        exercises = 8,
        workoutStyle = "HIIT"
)

