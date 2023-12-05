package com.exrtcoding.EXRTComposeMultiplatform.profile.domain.profile

data class Profile(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val username: String,
    val workoutTime: Long,
    val photoBytes: ByteArray?,
    val weight: Long,
    val height: String,
    val gender: String,
    val profilePrivate: Boolean = true
)
