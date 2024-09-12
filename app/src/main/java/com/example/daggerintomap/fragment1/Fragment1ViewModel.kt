package com.example.daggerintomap.fragment1

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.daggerintomap.factory.ViewModelAssistedFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class Fragment1ViewModel @AssistedInject constructor(
    @Assisted handle: SavedStateHandle
) : ViewModel() {

    @AssistedFactory
    interface Factory : ViewModelAssistedFactory<Fragment1ViewModel> {

        override fun create(
            handle: SavedStateHandle
        ): Fragment1ViewModel
    }
}