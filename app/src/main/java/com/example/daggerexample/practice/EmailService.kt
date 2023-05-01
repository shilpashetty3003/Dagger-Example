package com.example.daggerexample.practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(email: String)
}



@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(email: String) {
        Log.d("TAG", "registerEmail: ")
    }
}

class MessageService @Inject constructor(val retryCount:Int) : NotificationService {
    override fun send(email: String) {
        Log.d("TAG", "MessageService: $retryCount")
    }

}