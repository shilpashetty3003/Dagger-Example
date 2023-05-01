package com.example.daggerexample.dagger_retrofit_room.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.daggerexample.dagger_retrofit_room.ResultState
import com.example.daggerexample.dagger_retrofit_room.api.FakerService
import com.example.daggerexample.dagger_retrofit_room.db.FakerDatabase
import com.example.daggerexample.dagger_retrofit_room.models.Products
import javax.inject.Inject

class FakerRepository @Inject constructor(var fakerService: FakerService,val fakerDatabase:FakerDatabase) {

    val fakerResult = MutableLiveData<ResultState<List<Products>>>()
    val fakerResult_: LiveData<ResultState<List<Products>>>
        get() = fakerResult

    suspend fun getUsers() {
        try{
            val result = fakerService.getAllUsers()
            if (result != null) {
                fakerDatabase.fakerDao().insertUser(result)
                fakerResult.postValue(ResultState.Success(fakerDatabase.fakerDao().getAllUsers()))
                //fakerResult.postValue(ResultState.Success(result))
            } else {
                fakerResult.postValue(ResultState.Failure("Errror"))
            }
        }catch (error:Exception){
            fakerResult.postValue(ResultState.Failure(error.toString()))
        }

    }
}