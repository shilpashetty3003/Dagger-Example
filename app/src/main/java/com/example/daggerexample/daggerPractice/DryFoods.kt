package com.example.daggerexample.daggerPractice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private val TAG = "DryFoods"

interface DryFoods {
    fun food()
}

@Singleton
class Mango @Inject constructor(val juiceService: JuiceService) : DryFoods {
    override fun food() {
        Log.d(TAG, "OrangeFood:  ")
        juiceService.location()
    }
}

class Apple : DryFoods {
    override fun food() {

        Log.d(TAG, "Applesfood: ")
    }
}