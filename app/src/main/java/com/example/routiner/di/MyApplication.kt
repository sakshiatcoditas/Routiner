package com.example.routiner.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//Di Hilt class to provide hilt to the entire app
@HiltAndroidApp
class MyApplication : Application()