package com.example.daggerexample.practice

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


@ActivityScope
class UserRegistrationService @Inject constructor(
    private val userService: UserService,
    @MessagrQualifier var notificationService: NotificationService
) {

    fun registerUser(name: String, lastname: String) {
        userService.insertUser(name, lastname)
        notificationService.send("sss")
    }
}