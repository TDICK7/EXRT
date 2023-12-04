package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import com.plcoding.EXRTComposeMultiplatform.profile.domain.ProfileDataSource
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProfilePageViewModel(private val profileDataSource: ProfileDataSource): ViewModel() {
    private val _state = MutableStateFlow(ProfilePageState())
    val state = combine (
        _state,
        profileDataSource.getProfile(),
    ) { state, profile ->
        state.copy(
            //profile = profile
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), ProfilePageState())
    var newProfile: Profile? by mutableStateOf(null)
    private set

    fun onEvent(event: ProfilePageEvent){
        when(event) {
            ProfilePageEvent.DeleteProfile -> {
                viewModelScope.launch {
                    _state.value.selectedProfile?.let {profile ->
                        _state.update { it.copy(
                            isProfilePageOpen = false
                        ) }
                        profileDataSource.deleteProfile(profile.id)
                    }
                }
            }

            ProfilePageEvent.DismissProfilePage -> TODO()
            is ProfilePageEvent.EditProfile -> TODO()
            is ProfilePageEvent.OnEmailChanged -> TODO()
            is ProfilePageEvent.OnFirstNameChanged -> TODO()
            ProfilePageEvent.OnFriendTabPicked -> TODO()
            is ProfilePageEvent.OnLastNameChanged -> TODO()
            is ProfilePageEvent.OnProfilePhotoChanged -> TODO()
            is ProfilePageEvent.OnUsernameChanged -> TODO()
            ProfilePageEvent.SaveProfilePage -> TODO()
            is ProfilePageEvent.SelectProfile -> TODO()
        }
    }
}

