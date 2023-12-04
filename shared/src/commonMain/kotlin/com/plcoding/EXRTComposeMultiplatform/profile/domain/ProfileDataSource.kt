package com.plcoding.EXRTComposeMultiplatform.profile.domain

import kotlinx.coroutines.flow.Flow

interface ProfileDataSource {
    fun getProfile(): Flow<Profile>
    suspend fun insertProfile(profile: Profile)
    suspend fun deleteProfile(id: Long)
}
