package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.practice.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userService: UserRegistrationService

    @Inject
    lateinit var firebaseService: FirebaseService

    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var appComponent = (application as MyApplication).appComponent

        var userComponent= appComponent.userComponentBuilder().retryCount(2).dbName("Appp").build()

        userComponent.inject(this)
        userService.registerUser("Shilpa", "Shetty")
        emailService.send("ss@gmail.com")

    }
}