package com.example.daggerintomap.fragment1.di

import androidx.lifecycle.ViewModel
import com.example.daggerintomap.factory.ViewModelAssistedFactory
import com.example.daggerintomap.factory.ViewModelKey
import com.example.daggerintomap.fragment1.Fragment1ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class Fragment1Module {
    @IntoMap
    @ViewModelKey(Fragment1ViewModel::class)
    @Provides
    fun viewModelAssistedFactory(
        factory: Fragment1ViewModel.Factory
    ): ViewModelAssistedFactory<out ViewModel> = factory
}