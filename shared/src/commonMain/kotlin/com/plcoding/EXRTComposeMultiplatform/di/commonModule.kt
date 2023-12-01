package com.plcoding.EXRTComposeMultiplatform.di

import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard.LeaderboardScreenModel
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile.ProfileScreenModel
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Workout.WorkoutScreenModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun commonModule() = module {

    single<LeaderboardScreenModel> {
        LeaderboardScreenModel(

        )
    }

    single<ProfileScreenModel> {
        ProfileScreenModel(

        )
    }

    single<WorkoutScreenModel> {
        WorkoutScreenModel(

        )
    }
}

expect fun platformModule(): Module
