package com.plcoding.EXRTComposeMultiplatform.profile.domain

data class Profile(
    val firstName: String,
    val lastName: String,
    val email: String,
    val username: String,
    val workoutTime: Int,
    val photoBytes: ByteArray?,
    val weight: Long,
    val height: String,
    val gender: Boolean,
    val profilePrivate: Boolean = true
)
