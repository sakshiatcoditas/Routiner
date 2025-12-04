package com.example.routiner.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.routiner.presentation.ForgotPasswordScreen
import com.example.routiner.presentation.LoginScreen
import com.example.routiner.presentation.OnboardingScreen
import com.example.routiner.presentation.SplashScreen
import com.example.routiner.viewmodel.LoginViewModel

@Composable
fun AppNavGraph(){

    val loginViewModel: LoginViewModel = hiltViewModel()

    val navController=rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splashscreen"){

        composable(Route.SplashScreen.route){
            SplashScreen(
                navController = rememberNavController()
            )
        }

        composable (Route.OnboardingScreen.route){
            OnboardingScreen(navController = rememberNavController())
        }

        composable (Route.LoginScreen.route){
            LoginScreen(navController = rememberNavController(),
                viewModel = loginViewModel
            )
        }

        composable(Route.ForgotPasswordScreen.route) {
            ForgotPasswordScreen(navController = rememberNavController())

        }
    }

}
