package com.example.daggerexample.hilt

import android.util.Log
import javax.inject.Inject


class UserService @Inject constructor(){

    fun send(){
        Log.d("TAG", "send: ")
    }
}