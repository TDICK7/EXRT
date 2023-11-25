package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard

import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

data class LeaderboardListState(
    val profiles: List<Profile> = emptyList(),
    val recentlyViewedProfile: List<Profile> = emptyList(),
    val selectedFriendProfile: Profile? = null,
    val isFriendProfilePublic: Boolean = false,
    val isProfilePageOpen: Boolean = false,
    val isFriendProfilePageOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val usernameError: String? = null,
    )
