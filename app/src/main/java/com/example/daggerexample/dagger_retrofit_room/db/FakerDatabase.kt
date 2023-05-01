package com.example.daggerexample.dagger_retrofit_room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerexample.dagger_retrofit_room.models.Products

@Database(entities = [Products::class], version = 1)
abstract  class FakerDatabase:RoomDatabase() {

    abstract fun fakerDao():FakeDAO
}