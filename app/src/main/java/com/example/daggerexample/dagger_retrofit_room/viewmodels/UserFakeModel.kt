package com.example.daggerexample.dagger_retrofit_room.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject


class UserFakeModel @Inject constructor() :ViewModel() {

    init {
        Log.d("TAG", "constructorconstructor: ")
    }
}