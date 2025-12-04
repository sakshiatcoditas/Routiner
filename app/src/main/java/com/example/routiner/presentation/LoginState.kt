package com.example.routiner.presentation


//State showcase
sealed class LoginState {
    object Idle : LoginState()
    object Loading : LoginState()
    data class Success(val uid: String) : LoginState()
    data class Error(val message: String) : LoginState()
}