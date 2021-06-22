package com.senijoshua.tweeter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tweeter.libraries.navigator.Navigator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // onStart always go to the Login Screen where a conditional navigation will be set to
        // go to home screen if the user is a regular user.
        Navigator.goToLoginScreenIntent(this)
    }
}
