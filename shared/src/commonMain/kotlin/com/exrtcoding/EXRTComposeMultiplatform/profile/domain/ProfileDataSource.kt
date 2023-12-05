package com.exrtcoding.EXRTComposeMultiplatform.profile.domain

import com.exrtcoding.EXRTComposeMultiplatform.profile.domain.profile.Profile
import kotlinx.coroutines.flow.Flow

interface ProfileDataSource {
    fun getProfile(): Flow<Profile>
    suspend fun insertProfile(profile: Profile)
    suspend fun deleteProfile(id: Long)
}
