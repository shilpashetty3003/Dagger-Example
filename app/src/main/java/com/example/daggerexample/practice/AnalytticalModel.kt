package com.example.daggerexample.practice

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalytticalModel {

    @Provides
    @Singleton
    fun getAnalyticalServices():AnalyticalService{
        return  MyPanelService()
    }


}