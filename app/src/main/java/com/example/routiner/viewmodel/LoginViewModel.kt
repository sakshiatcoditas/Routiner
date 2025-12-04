package com.example.routiner.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.routiner.presentation.LoginState
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val auth: FirebaseAuth
): ViewModel() {

    private val _loginState = MutableStateFlow<LoginState>(LoginState.Idle)
    val loginState = _loginState.asStateFlow()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _loginState.value = LoginState.Loading
            if (email.isBlank() || password.isBlank()) {
                _loginState.value = LoginState.Error("Email and password cannot be empty.")
                return@launch
            }
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        _loginState.value = LoginState.Success(task.result?.user?.uid ?: "")
                    } else {
                        _loginState.value = LoginState.Error(task.exception?.message ?: "An unknown error occurred.")
                    }
                }
        }
    }



    fun resetState() {
        _loginState.value = LoginState.Idle
    }
}
