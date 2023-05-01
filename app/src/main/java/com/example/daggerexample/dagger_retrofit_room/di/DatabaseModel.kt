package com.example.daggerexample.dagger_retrofit_room.di

import android.content.Context
import androidx.room.Room
import com.example.daggerexample.dagger_retrofit_room.db.FakerDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModel {

    @Singleton
    @Provides
    fun databaseService(context:Context):FakerDatabase{
        return Room.databaseBuilder(context,FakerDatabase::class.java,"FakerDatabase").build()
    }

}