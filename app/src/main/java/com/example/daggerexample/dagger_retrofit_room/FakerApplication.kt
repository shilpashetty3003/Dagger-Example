package com.example.daggerexample.dagger_retrofit_room

import android.app.Application
import com.example.daggerexample.dagger_retrofit_room.di.DaggerNetworkComponent
import com.example.daggerexample.dagger_retrofit_room.di.NetworkComponent

class FakerApplication : Application() {

    lateinit var networkComponent: NetworkComponent
    override fun onCreate() {
        super.onCreate()
        initializeComponent()
    }

    private fun initializeComponent() {
        networkComponent = DaggerNetworkComponent.factory().create(this)
    }
}