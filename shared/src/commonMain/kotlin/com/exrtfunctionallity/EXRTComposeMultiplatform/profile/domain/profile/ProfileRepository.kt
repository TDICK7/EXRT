package com.exrtfunctionallity.EXRTComposeMultiplatform.profile.domain.profile

import kotlinx.coroutines.flow.Flow

interface ProfileRepository {
    suspend fun saveAppTheme(theme: Int)
    fun getAppTheme(): Flow<Int?>
    fun getUsername(): Flow<String?>
    fun saveUsername(value: String)
    fun getEmail(): Flow<String?>
    fun saveEmail(value: String)
    fun getProfileId(): Flow<Long?>


}
