package com.example.daggerexample.daggerPractice

import com.example.daggerexample.MainActivity
import com.example.daggerexample.daggerPractice.DaggerJuiceComponent.Builder
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton


@Singleton
@Subcomponent( modules = [DryFoodModule::class,SweetModule::class])
interface FoodComponent {
    //  fun getDryFood():Mango

    fun inject(mainActivity: DaggerPractice)

    @Subcomponent.Builder
    interface Builder{
        fun build():FoodComponent
        fun  foodName( @BindsInstance foodName:String):Builder
        fun foodSweets(@BindsInstance foodSweetes: Int):Builder
//        fun create(@BindsInstance foodName:String, @BindsInstance foodSweetes:Int):FoodComponent
    }
}