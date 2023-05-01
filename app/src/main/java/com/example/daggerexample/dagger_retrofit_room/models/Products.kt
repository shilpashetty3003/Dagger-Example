package com.example.daggerexample.dagger_retrofit_room.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "FakerUsers")
data class Products(
    val category: String,
    val description: String,
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)