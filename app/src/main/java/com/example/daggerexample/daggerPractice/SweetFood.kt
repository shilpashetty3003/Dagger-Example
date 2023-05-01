package com.example.daggerexample.daggerPractice

import android.util.Log
import javax.inject.Inject

private val TAG = "SweetFood"

interface SweetFood {
    fun sweets()
}

class Chiku @Inject constructor() : SweetFood {
    override fun sweets() {

        Log.d(TAG, "Chikusweets: ")
    }
}

class Bnanna : SweetFood {
    override fun sweets() {

        Log.d(TAG, "Bnannasweets: ")
    }
}