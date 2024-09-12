package com.example.daggerintomap.fragment2

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.daggerintomap.factory.ViewModelAssistedFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class Fragment2ViewModel @AssistedInject constructor(
    @Assisted handle: SavedStateHandle
) : ViewModel() {

    @AssistedFactory
    interface Factory : ViewModelAssistedFactory<Fragment2ViewModel> {

        override fun create(
            handle: SavedStateHandle
        ): Fragment2ViewModel
    }
}