package com.example.daggerexample.practice

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalytticalModel::class])
interface AppComponent {
//    fun getAnalyticalService():AnalyticalService
    fun userComponentBuilder():UserComponent.Builder
}