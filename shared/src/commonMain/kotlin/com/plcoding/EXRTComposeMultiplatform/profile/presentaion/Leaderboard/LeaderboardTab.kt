package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.Leaderboard

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
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.rounded.PersonAdd
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

object LeaderboardTab : Tab {

    val state = LeaderboardListState()
    val profile: Profile? = null

    @Composable
    override fun Content() {

        Scaffold(
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        LeaderboardPageEvent.SaveLeaderBoard
                    },
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.PersonAdd,
                        contentDescription = "Add Friend",
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
                items(state.profiles) { profile ->
                    LeaderboardPageList(
                        profile = profile,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                LeaderboardPageEvent.SelectUser(profile)
                            }
                            .padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
    override val options: TabOptions
        @Composable
        get() {
            val index: UShort = 1u
            val icon = rememberVectorPainter(Icons.Default.EmojiEvents)
            val title = "Leaderboard"

            return TabOptions(
                index, title, icon
            )
        }
}
