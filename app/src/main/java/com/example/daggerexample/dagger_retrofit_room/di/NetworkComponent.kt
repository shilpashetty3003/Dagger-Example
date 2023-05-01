package com.example.daggerexample.dagger_retrofit_room.di

import android.content.Context
import android.provider.ContactsContract.Data
import androidx.lifecycle.ViewModel
import com.example.daggerexample.MainActivity
import com.example.daggerexample.dagger_retrofit_room.ui.SampleDagger
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModel::class,DatabaseModel::class,ViewModelModule::class])
interface NetworkComponent {

    fun inject(sampleDagger: SampleDagger)
    fun getMap():Map<Class<*>,ViewModel>


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):NetworkComponent

    }
}