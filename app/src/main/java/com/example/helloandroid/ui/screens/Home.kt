package com.example.helloandroid.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.helloandroid.R

@Composable
fun Home() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(painter = painterResource(id = R.drawable.android_logo_icon),
            contentDescription = "Android")

        Text(
            text = "Hello"
        )
        Text(
            text = "Android!"
        )
        Text(
            text = "Welcome to my Android app!!!"
        )
    }
}