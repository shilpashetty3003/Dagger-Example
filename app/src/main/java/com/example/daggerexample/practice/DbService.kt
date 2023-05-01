package com.example.daggerexample.practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserService{
    fun insertUser(name:String,lastName:String)
}
class DbService @Inject constructor(val dbName:String,var analyticalService: AnalyticalService) :UserService{

    override fun insertUser(name:String, lastName:String){
        Log.d("TAG", "insertUser In Db: $dbName")
        analyticalService.trackEvent(3,"My Name is Shilpa")
    }
}

class FirebaseService @Inject constructor(val count:Int) :UserService{
    override fun insertUser(name: String, lastName: String) {
        Log.d("TAG", "insertUser in Firebase: $count")
    }
}