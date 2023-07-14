package com.senijoshua.tweeter

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TweeterApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
