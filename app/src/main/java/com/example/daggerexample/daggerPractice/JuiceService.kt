package com.example.daggerexample.daggerPractice

import android.util.Log
import javax.inject.Inject

private val TAG="JuiceCenter"
interface JuiceService {

    fun location()
}

class Mumbai @Inject constructor():JuiceService{
    override fun location() {
        Log.d(TAG, "location: ")
    }
}
class Indore ():JuiceService{
    override fun location() {
        Log.d(TAG, "location: ")
    }
}