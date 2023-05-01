package com.example.daggerexample.daggerPractice

import android.util.Log
import javax.inject.Inject

class FoodService @Inject constructor (@MangoQualifier val dryFoods: DryFoods,val sweetFood: SweetFood) {


    fun getFoods(){
        dryFoods.food()
        sweetFood.sweets()
    }

}