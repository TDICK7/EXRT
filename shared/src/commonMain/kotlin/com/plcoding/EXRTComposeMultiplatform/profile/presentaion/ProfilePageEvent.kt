package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

sealed interface ProfilePageEvent {
    object DismissProfilePage: ProfilePageEvent
    data class OnFirstNameChanged (val value: String): ProfilePageEvent
    data class OnLastNameChanged (val value: String): ProfilePageEvent
    data class OnEmailChanged (val value: String): ProfilePageEvent
    data class OnUsernameChanged (val value: String): ProfilePageEvent
    class OnProfilePhotoChanged (val value: ByteArray): ProfilePageEvent
    object OnFriendTabPicked: ProfilePageEvent
    object SaveProfilePage: ProfilePageEvent
    data class SelectProfile (val value: Profile): ProfilePageEvent
    data class EditProfile(val value: Profile): ProfilePageEvent
    object DeleteProfile: ProfilePageEvent
}
