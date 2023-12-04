package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Profile

import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

data class ProfilePageState(
    val selectedProfile: Profile? = null,
    val isProfilePageOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
)
