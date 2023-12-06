package com.exrtcoding.EXRTComposeMultiplatform.profile.data

import com.exrtcoding.EXRTComposeMultiplatform.profile.domain.profile.Profile
import database.ProfileEntity

fun ProfileEntity.toProfile(): Profile {
    return Profile(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        photoBytes = null, //TODO: Get Image
        gender = gender,
        height = height,
        username = username,
        weight = weight,
        workoutTime = workoutTime
    )
}
