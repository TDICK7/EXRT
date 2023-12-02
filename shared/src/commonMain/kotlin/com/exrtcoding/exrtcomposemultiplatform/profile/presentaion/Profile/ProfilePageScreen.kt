package com.exrtcoding.exrtcomposemultiplatform.profile.presentaion.Profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Scale
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.core.screen.Screen

class ProfilePageScreen: Screen {
    @Composable
    override fun Content() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                var filledText by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = filledText,
                    onValueChange = { filledText = it },
                    textStyle = LocalTextStyle.current.copy(
                        textAlign = TextAlign.Right
                    ),
                    label = {
                        Text(text = "Enter your Weight")
                    },
                    placeholder = {
                        Text(text = "Weight")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Scale,
                            contentDescription = "Scale"
                        )
                    },
                    suffix = {
                        Text(text = "Lb")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            println("Test")
                        }
                    )
                )
            }
        }
    }
}


