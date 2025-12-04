package com.example.routiner.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.routiner.presentation.ForgotPasswordScreen
import com.example.routiner.presentation.LoginScreen
import com.example.routiner.presentation.OnboardingScreen
import com.example.routiner.presentation.RegisterGenderScreen
import com.example.routiner.presentation.RegisterHabitScreen
import com.example.routiner.presentation.RegisterScreen
import com.example.routiner.presentation.SplashScreen

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Route.SplashScreen.route
    ) {

        composable(Route.SplashScreen.route) {
            SplashScreen(
                navController = navController
            )
        }

        composable(Route.OnboardingScreen.route) {
            OnboardingScreen(navController = navController)
        }

        composable(Route.LoginScreen.route) {
            LoginScreen(
                navController = navController,
            )
        }

        composable(Route.ForgotPasswordScreen.route) {
            ForgotPasswordScreen(navController = navController)
        }

        composable(Route.RegisterScreen.route) {
            RegisterScreen(
                navController = navController
            )
        }

        composable(Route.RegisterGenderScreen.route) {
            RegisterGenderScreen(navController = navController)
        }

        composable(Route.RegisterHabitScreen.route) {
            RegisterHabitScreen(navController = navController)
        }
    }
}
