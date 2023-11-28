package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Workout

import com.plcoding.EXRTComposeMultiplatform.profile.domain.FriendProfile

sealed interface WorkoutPageEvent {
    object OnExerciseInput: WorkoutPageEvent
    object OnRepetitionInput: WorkoutPageEvent
    data class  OnWorkoutSentToFriend (val value: FriendProfile): WorkoutPageEvent
}
