package com.example.daggerintomap.di

import android.content.Context
import com.example.daggerintomap.fragment1.Fragment1
import com.example.daggerintomap.fragment1.di.Fragment1Module
import com.example.daggerintomap.fragment2.Fragment2
import com.example.daggerintomap.fragment2.di.Fragment2Module
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        Fragment1Module::class,
        Fragment2Module::class
    ]
)
interface AppComponent {
    fun inject(fragment1: Fragment1)
    fun inject(fragment2: Fragment2)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}