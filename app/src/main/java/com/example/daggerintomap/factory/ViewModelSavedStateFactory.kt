package com.example.daggerintomap.factory

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.MapKey
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class ViewModelSavedStateFactory @Inject constructor(
    private val viewModelAssistedFactory: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModelAssistedFactory<out ViewModel>>>
) : AbstractSavedStateViewModelFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        val factoryProvider = viewModelAssistedFactory[modelClass]
            ?: throw IllegalArgumentException("Unknown model class $modelClass")
        return factoryProvider.get().create(handle) as T
    }
}

interface ViewModelAssistedFactory<T : ViewModel> {
    fun create(
        handle: SavedStateHandle
    ): T
}

@MapKey
annotation class ViewModelKey(val name: KClass<out ViewModel>)