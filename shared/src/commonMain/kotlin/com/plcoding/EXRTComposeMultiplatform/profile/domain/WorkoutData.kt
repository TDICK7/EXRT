package com.plcoding.EXRTComposeMultiplatform.profile.domain

data class WorkoutData(
    val sets: Int,
    val reps: Int,
    val workoutTime: Long,
    val exercises: Int,
    val workoutStyle: String,
)
