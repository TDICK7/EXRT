package com.plcoding.EXRTComposeMultiplatform.profile.domain

data class Profile(
    val id: Long?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val profilePhoto: ByteArray,
    val username: String,
)
