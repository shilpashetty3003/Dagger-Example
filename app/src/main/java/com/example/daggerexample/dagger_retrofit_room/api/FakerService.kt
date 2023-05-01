package com.example.daggerexample.dagger_retrofit_room.api

import androidx.room.Dao
import com.example.daggerexample.dagger_retrofit_room.models.Products
import retrofit2.Response
import retrofit2.http.GET


@Dao
interface FakerService {

    @GET("products")
    suspend fun getAllUsers():List<Products>
}