package com.example.dreamteamapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import com.example.dreamteamapp.ui.theme.DreamTeamAppTheme
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DreamTeamAppTheme {
                MainScreen(this)
            }
        }
    }
}

@Composable
fun MainScreen(context: Context) {
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

            Button(
                onClick = {


                }
            ) {
                Text (
                    text = "Student 1: Penafiel Bio"
                )
            }

            Button(
                onClick = { }
            ) {
                Text (
                    text = "Student 2: Quitorio Bio"
                )
            }

            Button(
                onClick = { }
            ) {
                Text (
                    text = "Student 3: Rabano Bio"
                )
            }

            Button(
                onClick = { }
            ) {
                Text (
                    text = "Student 4: Recio Bio"
                )
            }

            Button(
                onClick = { }
            ) {
                Text (
                    text = "Student 5: Rosales Bio"
                )
            }
        }
    }
}