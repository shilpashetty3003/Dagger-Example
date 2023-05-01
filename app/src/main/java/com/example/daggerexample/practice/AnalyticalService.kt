package com.example.daggerexample.practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface AnalyticalService {
    fun trackEvent(id:Int,name:String)
}

@Singleton
class MyPanelService @Inject constructor():AnalyticalService{
    override fun trackEvent(id: Int, name: String) {
        Log.d("TAG", "MyPanelService: $id $name ")
    }
}

class FirebaseAnalyticService():AnalyticalService{
    override fun trackEvent(id: Int, name: String) {
        Log.d("TAG", "FirebaseAnalyticService:$id $name ")
    }

}

