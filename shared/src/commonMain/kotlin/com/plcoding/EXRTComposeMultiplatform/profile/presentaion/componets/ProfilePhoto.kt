package com.plcoding.EXRTComposeMultiplatform.profile.presentaion.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.plcoding.EXRTComposeMultiplatform.core.presentation.rememberBitmapFromBytes
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile

@Composable
fun ProfilePhoto (
    profile: Profile?,
    modifier: Modifier = Modifier,
    iconSize: Dp = 25.dp

){
    val bitmap = rememberBitmapFromBytes(profile?.profilePhoto)
    val profileModifier = modifier.clip(RoundedCornerShape(35))
    if(profile?.profilePhoto != null) {
        if (bitmap != null) {
            Image(
                bitmap = bitmap,
                contentDescription = profile?.firstName,
                modifier = profileModifier,
                contentScale = ContentScale.Fit
            )
        }
    } else {
        Box(
            modifier = profileModifier
                .background(MaterialTheme.colorScheme.secondaryContainer),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = profile?.firstName,
                modifier = Modifier.size(iconSize),
                tint = MaterialTheme.colorScheme.onSecondaryContainer

            )
        }
    }
}


