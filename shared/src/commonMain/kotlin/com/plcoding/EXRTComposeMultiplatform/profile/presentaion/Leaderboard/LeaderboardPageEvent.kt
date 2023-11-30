package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard

import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

 interface LeaderboardPageEvent {
    object DismissProfilePage: LeaderboardPageEvent
    object SaveLeaderBoard: LeaderboardPageEvent
    data class SelectUser (val value: Profile): LeaderboardPageEvent
    object  SortLeaderboardByRegion: LeaderboardPageEvent
}
