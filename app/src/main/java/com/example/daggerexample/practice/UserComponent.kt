package com.example.daggerexample.practice

import com.example.daggerexample.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton


@ActivityScope
@Subcomponent( modules = [UserModule::class, NotificationModule::class])
interface UserComponent {

    fun inject(activity: MainActivity)

    fun getEmailService():EmailService

    fun getFirebaseService():FirebaseService

    @Subcomponent.Builder
    interface Builder {
        fun build():UserComponent
        fun retryCount(@BindsInstance retryCount: Int):Builder
        fun dbName(@BindsInstance dbName: String):Builder
//        fun create(@BindsInstance retryCount: Int, @BindsInstance dbName: String): UserComponent
    }
}