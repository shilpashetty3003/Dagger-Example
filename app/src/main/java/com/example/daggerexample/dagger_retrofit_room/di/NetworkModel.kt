package com.example.daggerexample.dagger_retrofit_room.di

import com.example.daggerexample.dagger_retrofit_room.Constants
import com.example.daggerexample.dagger_retrofit_room.api.FakerService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModel {


    @Singleton
    @Provides
    fun getRetrofitService(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }


    @Singleton
    @Provides
    fun getFakerService(retrofit: Retrofit): FakerService {
        return retrofit.create(FakerService::class.java)
    }
}