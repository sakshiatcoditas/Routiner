package com.example.routiner.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ForgotPasswordScreen(
    navController: NavController
){

    var registeredEmail by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = "Forgot Password Screen",
            style = TextStyle.Default,
            color = Color.Black,
            fontSize = 12.sp


        )
        Spacer(modifier = Modifier.fillMaxSize().padding(
            12.dp
        ))

        Text(
            text = "Back to Login",
            style = TextStyle.Default,
            color = Color.Black,
            fontSize = 12.sp

        )

        Spacer(modifier = Modifier.fillMaxSize().padding(
            12.dp
        ))

        Text(
            text = "Enter your Registered Email",
            style = TextStyle.Default,
            color = Color.Black,
            fontSize = 12.sp

        )

        Spacer(modifier = Modifier.fillMaxSize().padding(
            12.dp
        ))

        OutlinedTextField(
            value = registeredEmail,
            onValueChange = {
                registeredEmail=it
            },
            modifier = Modifier.fillMaxWidth(
                0.8f
            ),

            label = {
                Text(text = "Email")
            }
        )



    }
}