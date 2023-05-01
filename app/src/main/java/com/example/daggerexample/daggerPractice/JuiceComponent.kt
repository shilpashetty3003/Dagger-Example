package com.example.daggerexample.daggerPractice

import dagger.Component


@Component(modules = [JuiceModule::class])
interface JuiceComponent {

    fun getFoodService():FoodComponent.Builder
}