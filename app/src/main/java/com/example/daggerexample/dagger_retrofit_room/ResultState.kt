package com.example.daggerexample.dagger_retrofit_room

sealed class ResultState<T> {

    class Loading<T>() : ResultState<T>()
    class Success<T>(var data: T) : ResultState<T>()
    class Failure<T>(var errors: String) : ResultState<T>()

}
