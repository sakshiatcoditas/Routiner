package com.example.routiner.viewmodel

import androidx.lifecycle.ViewModel
import com.example.routiner.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class LoginViewModel @Inject constructor(
    val repository: AuthRepository

):ViewModel(

) {
    private val auth = FirebaseAuth.getInstance()


    fun login(email: String, password: String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                if(it.isSuccessful){
                    //navigate to home screen
                }
                else{
                    //show error message
                    it.exception?.message

                }
            }

    }



}