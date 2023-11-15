package com.plcoding.EXRTComposeMultiplatform.profile.presentaion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PersonAdd
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets.ProfilePageList

@Composable
fun ProfilePageScreen (
    state: ProfileListState,
    newProfile: Profile?,
    onEvent: (ProfilePageEvent) -> Unit,
){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    onEvent(ProfilePageEvent.SaveProfilePage)
                },
                shape = RoundedCornerShape(20.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.PersonAdd,
                    contentDescription = "Add Profile Pic",
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                Text(
                    text = "Leaderboard",
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            items(state.profile) { profile ->
                ProfilePageList(
                    profile = profile,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onEvent(ProfilePageEvent.SelectProfile(profile))
                        }
                        .padding(horizontal = 16.dp)
                )
            }
        }
    }
}
