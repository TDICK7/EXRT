package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Workout

import com.plcoding.EXRTComposeMultiplatform.profile.domain.WorkoutData

data class WorkoutPageState(
    val workout: WorkoutData,
    val isWorkoutPageOpen: Boolean = false,
    val workoutError: String? = null,
)

