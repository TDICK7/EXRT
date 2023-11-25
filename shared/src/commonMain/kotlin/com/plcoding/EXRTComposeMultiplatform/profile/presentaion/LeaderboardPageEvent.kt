package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

sealed interface LeaderboardPageEvent {
    object DismissProfilePage: LeaderboardPageEvent
    data class OnFirstNameChanged (val value: String): LeaderboardPageEvent
    data class OnLastNameChanged (val value: String): LeaderboardPageEvent
    data class OnEmailChanged (val value: String): LeaderboardPageEvent
    data class OnUsernameChanged (val value: String): LeaderboardPageEvent
    class OnProfilePhotoChanged (val value: ByteArray): LeaderboardPageEvent
    object OnFriendTabPicked: LeaderboardPageEvent
    object SaveLeaderBoard: LeaderboardPageEvent
    data class SelectProfile (val value: Profile): LeaderboardPageEvent
    data class EditProfile(val value: Profile): LeaderboardPageEvent
    object DeleteProfile: LeaderboardPageEvent
}
