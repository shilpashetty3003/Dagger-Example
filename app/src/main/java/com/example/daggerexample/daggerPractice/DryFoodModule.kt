package com.example.daggerexample.daggerPractice

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DryFoodModule() {

    @Singleton
    @MangoQualifier
    @Provides
    fun getMangoService(mango:Mango):DryFoods{
        return mango
    }

    @AppleQualifier
    fun getAppleService():DryFoods{
        return Apple()
    }

}