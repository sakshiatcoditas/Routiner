package com.example.routiner.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.routiner.R
import com.example.routiner.navigation.Route


@Composable
fun RegisterScreen(
    navController: NavController
){



    var name by rememberSaveable() {
            mutableStateOf("")
    }

    var birthdate by rememberSaveable() {
        mutableStateOf("")
    }

    var email by rememberSaveable() {
        mutableStateOf("")
    }

    var surname by rememberSaveable() {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {
                    navController.navigate(Route.OnboardingScreen.route)
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backarrow),
                    contentDescription = "back arrow"
                )
            }

            Text(
                text = "Register Screen",
                style = TextStyle.Default,
                color = Color.Black
            )

        }



        OutlinedTextField(
            value = name,
            onValueChange = {
                name=it
            },
            label = {
                Text(text = "Name")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                disabledContainerColor = Color.Black,
            )



        )

        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))

        OutlinedTextField(
            value = surname,
            onValueChange = {
                surname=it
            },
            label = {
                Text(text = "Surname")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor =Color.Black,
                unfocusedContainerColor = Color.Black,
                disabledContainerColor = Color.Black,
            )



        )

        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))


        OutlinedTextField(
            value = birthdate,
            onValueChange = {
                birthdate=it
            },
            label = {
                Text(text = "Birthdate")
            },
           //Change this to the datepicker outline field
            colors = TextFieldDefaults.colors(
                focusedContainerColor =Color.Black,
                unfocusedContainerColor = Color.Black,
                disabledContainerColor = Color.Black,
            )



        )

        Text(
            text = "Forgot Password?",
            style = TextStyle.Default,
            color = Color.Black,
            modifier = Modifier.size(
                width = 200.dp,
                height = 50.dp
            ).
            clickable(
                onClick = {
                    navController.navigate(Route.ForgotPasswordScreen.route)
                }

            )


        )

        Spacer(
            modifier = Modifier.fillMaxSize().padding(12.dp)

        )

        Button(
            onClick = {
                viewModel.login(email, password)
            },
            modifier = Modifier.size(
                width = 200.dp,
                height = 50.dp
            )
        ) {
            Text(
                text = "Login",
                style = TextStyle.Default,
                color = androidx.compose.ui.graphics.Color.Black
            )
        }


    }



    }
}