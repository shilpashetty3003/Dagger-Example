package com.example.daggerexample.daggerPractice

import android.app.Application

class FoodApplication :Application(){

    lateinit var juiceComponent: JuiceComponent

    override fun onCreate() {
        super.onCreate()
        juiceComponent=DaggerJuiceComponent.builder().build()
    }
}