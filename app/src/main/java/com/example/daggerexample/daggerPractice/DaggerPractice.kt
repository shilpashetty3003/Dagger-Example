package com.example.daggerexample.daggerPractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.R
import javax.inject.Inject

class DaggerPractice : AppCompatActivity() {
//
    @Inject
    lateinit var mango: Mango

    @Inject
    lateinit var foodService: FoodService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_practice)

        val juiceComponent=DaggerJuiceComponent.builder().build()
        val foodComponent=juiceComponent.getFoodService().foodName("SHilpa").foodSweets(99).build()
//        val foodComponent=Da
        foodComponent.inject(this)
        foodService.getFoods()
//        mango.food()
    }
}