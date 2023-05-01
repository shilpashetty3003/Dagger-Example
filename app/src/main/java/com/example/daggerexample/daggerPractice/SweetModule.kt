package com.example.daggerexample.daggerPractice

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class SweetModule {

    @Binds
    abstract fun getChikuService(chiku: Chiku):SweetFood


}