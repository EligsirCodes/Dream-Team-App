package com.example.dreamteamapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RecioBio() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "DREAM TEAM APP",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
            )

            Text(
                text = "Joaquin Aaron P. Recio",
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.recio),
                contentDescription = "Recio's Profile Image",
                modifier = Modifier.size(100.dp)
            )

            Text(
                text = "I am 21 years old, I like to play basketball, play video games, watch sports, and watch netflix. I am a 3rd Year BSIT Student, and I'm the 3rd Year Representative of BSIT.",
                modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
            )
        }
    }
}