package com.example.daggerexample.dagger_retrofit_room.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.daggerexample.dagger_retrofit_room.models.Products


@Dao
interface FakeDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(product:List<Products>)

    @Query("select * from FakerUsers ")
    suspend fun getAllUsers():List<Products>
}