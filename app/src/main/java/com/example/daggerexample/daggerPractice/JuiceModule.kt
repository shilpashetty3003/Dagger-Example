package com.example.daggerexample.daggerPractice

import dagger.Module
import dagger.Provides

@Module
class JuiceModule {

    @Provides
    fun getMumbaiJuiceCenter():JuiceService{
        return Mumbai()
    }
}