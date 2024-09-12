package com.example.daggerintomap.fragment2.di

import androidx.lifecycle.ViewModel
import com.example.daggerintomap.factory.ViewModelAssistedFactory
import com.example.daggerintomap.factory.ViewModelKey
import com.example.daggerintomap.fragment2.Fragment2ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class Fragment2Module {
    @IntoMap
    @ViewModelKey(Fragment2ViewModel::class)
    @Provides
    fun viewModelAssistedFactory(
        factory: Fragment2ViewModel.Factory
    ): ViewModelAssistedFactory<out ViewModel> = factory
}