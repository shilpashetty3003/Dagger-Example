package com.example.daggerexample.practice

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
 class UserModule() {

    @Provides
    fun getUserService(dbService: DbService): UserService{
        return dbService
    }
}