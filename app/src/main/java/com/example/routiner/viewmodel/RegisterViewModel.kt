package com.example.routiner.viewmodel

import androidx.lifecycle.ViewModel
import com.example.routiner.model.User
import com.example.routiner.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class RegisterViewModel @Inject constructor(
    val repository: AuthRepository
):ViewModel()

    private val auth = FirebaseAuth.getInstance()

    private val database= FirebaseDatabase.getInstance()

   fun register(name: String, surname: String, birthdate: String, email: String, password: String){
       auth.createUserWithEmailAndPassword(email, password)
           .addOnCompleteListener{
               if(it.isSuccessful){
                   val user= User(
                       id = auth.currentUser!!.uid,
                       name = name,
                       surname = surname,
                       birthdate = birthdate,
                       email = email,
                       password = password,
                       habit = emptyList()
                   )
                   database.getReference("users").child(auth.currentUser!!.uid).setValue(user)


           }
               else{
                   it.exception?.message
               }
           }

   }



