package com.example.daggerintomap

import android.app.Application
import com.example.daggerintomap.di.DaggerAppComponent

class App : Application() {

    val component = DaggerAppComponent.factory().create(this)
}