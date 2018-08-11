package com.example.ateuhh.stepik_course

import android.app.Application
import io.realm.Realm

class App: Application(){

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        getSharedPreferences("name", 0).edit().putString("zz","xx").apply()

        getSharedPreferences("name", 0).getString("zz","xx")
    }
}