package com.example.daggerexample.dagger_retrofit_room.viewmodels

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerexample.dagger_retrofit_room.repo.FakerRepository
import javax.inject.Inject

class FakerViewModelFactory @Inject constructor(val map:Map<Class<*>,@JvmSuppressWildcards ViewModel>) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}