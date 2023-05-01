package com.example.daggerexample.dagger_retrofit_room.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerexample.dagger_retrofit_room.ResultState
import com.example.daggerexample.dagger_retrofit_room.models.Products
import com.example.daggerexample.dagger_retrofit_room.repo.FakerRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class FakerViewModel @Inject constructor(var fakerRepository: FakerRepository):ViewModel(){

    private val fakerData=MutableLiveData<ResultState<List<Products>>>()

    val fakerData_:LiveData<ResultState<List<Products>>>
    get()=fakerRepository.fakerResult_

    fun getFakerUser(){
        fakerData.postValue(ResultState.Loading())
        viewModelScope.launch {
            fakerRepository.getUsers()

        }
    }
}