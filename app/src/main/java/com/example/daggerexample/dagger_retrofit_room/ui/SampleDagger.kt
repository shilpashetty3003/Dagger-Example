package com.example.daggerexample.dagger_retrofit_room.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.daggerexample.R
import com.example.daggerexample.dagger_retrofit_room.FakerApplication
import com.example.daggerexample.dagger_retrofit_room.ResultState
import com.example.daggerexample.dagger_retrofit_room.viewmodels.FakerViewModel
import com.example.daggerexample.dagger_retrofit_room.viewmodels.FakerViewModelFactory
import javax.inject.Inject

class SampleDagger : AppCompatActivity() {

    lateinit var fakerViewModel: FakerViewModel

    @Inject
    lateinit var fakerViewModelFactory: FakerViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_dagger)
        setUpUI()
        setUpViewModel()
        setUpObservers()
    }

    private fun setUpObservers() {
        fakerViewModel.fakerData_.observe(this, Observer {
            when (it) {
                is ResultState.Failure -> {
                    Log.d("TAG", "setUpObservers: ${it.errors}")
                }
                is ResultState.Loading -> {}
                is ResultState.Success -> {
                    Log.d("TAG", "setUpObservers: " + it.data)
                }
            }
        })

    }

    private fun setUpViewModel() {
        fakerViewModel =
            ViewModelProvider(this, fakerViewModelFactory).get(FakerViewModel::class.java)
        fakerViewModel.getFakerUser()
    }

    private fun setUpUI() {
        (application as FakerApplication).networkComponent.inject(this)


    }
}