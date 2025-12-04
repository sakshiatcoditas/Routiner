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
import androidx.compose.material3.Button
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.routiner.R
import com.example.routiner.navigation.Route
import com.example.routiner.viewmodel.LoginViewModel



@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel
) {

    var email by rememberSaveable() {
        mutableStateOf("")
    }

    var password by rememberSaveable() {
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
                text = "Login Screen",
                style = TextStyle.Default,
                color = Color.Black
            )

        }

        OutlinedTextField(
            value = email,
            onValueChange = {
                email=it
            },
            label = {
                Text(text = "Email")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                disabledContainerColor = Color.Black,
            )



        )

        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
              password=it
            },
            label = {
                Text(text = "Password")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                disabledContainerColor = Color.Black,
            )



        )

        Spacer(modifier = Modifier.fillMaxSize().padding(12.dp))

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
                color = Color.Black
            )
        }


    }
}
