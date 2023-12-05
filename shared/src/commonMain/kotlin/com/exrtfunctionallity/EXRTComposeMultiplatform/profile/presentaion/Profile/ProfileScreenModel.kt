package com.exrtfunctionallity.EXRTComposeMultiplatform.profile.presentaion.Profile

import androidx.compose.runtime.mutableStateListOf
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.exrtfunctionallity.EXRTComposeMultiplatform.profile.domain.profile.ProfileRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class ProfileScreenModel(private val profileRepository: ProfileRepository): ScreenModel {

    val profilePageOpened = mutableStateListOf("")

    val appTheme: StateFlow<Int?> = profileRepository.getAppTheme()
        .map { it }
        .stateIn(
            scope = screenModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = null,
        )

    val getUsername: StateFlow<String?> = profileRepository.getUsername()
        .map { it }
        .stateIn(
            scope = screenModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = null,
        )

    val getEmail: StateFlow<String?> = profileRepository.getEmail()
        .map { it }
        .stateIn(
            scope = screenModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = null,
        )

    val getProfileId: StateFlow<Long?> = profileRepository.getProfileId()
        .map { it }
        .stateIn(
            scope = screenModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = null,
        )
}

