package com.plcoding.EXRTComposeMultiplatform.profile.domain

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Boolean,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)
