package com.example.routiner.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun OnboardingScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().
        background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Text("Create Good Habits",
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle.Default, color = Color.White)

        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))


        Text(text = "Change your habits with Routiner",style = TextStyle.Default,
            color = Color.White
        )
        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))


            //Dot Loader --To be added----

        Button(
            onClick = {
                navController.navigate("splashscreen")
            },
            modifier = Modifier.fillMaxWidth().
            size(
                width = 200.dp,
                height = 50.dp
            ).
            background(Color.White)
        ) {
            Text(
                text = "Continue with Email",
                style = TextStyle.Default,
                color = Color.Black

            )
        }


    }
}