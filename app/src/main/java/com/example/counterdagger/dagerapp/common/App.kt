package com.example.counterdagger.dagerapp.common

import android.app.Application
import com.example.counterdagger.dagerapp.di.components.AppComponent
import com.example.counterdagger.dagerapp.di.components.DaggerAppComponent


class App: Application() {

    var appComponent: AppComponent? = null

    override fun onCreate() {
        appComponent = DaggerAppComponent.create()
       super.onCreate()
    }
}