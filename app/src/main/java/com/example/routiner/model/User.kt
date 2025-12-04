package com.example.routiner.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val password: String,
    val surname:String,
    val birthdate: String,
    val habit:List<Habit>, //list of habits




)
