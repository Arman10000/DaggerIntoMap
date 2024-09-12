package com.example.daggerintomap.fragment2

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.daggerintomap.App
import com.example.daggerintomap.R
import com.example.daggerintomap.factory.ViewModelSavedStateFactory
import javax.inject.Inject

class Fragment2 : Fragment(R.layout.fragment_2) {

    @Inject
    lateinit var viewModelSavedStateFactory: ViewModelSavedStateFactory

    private val fragment2ViewModel: Fragment2ViewModel by viewModels {
        viewModelSavedStateFactory
    }

    override fun onAttach(context: Context) {
        (requireActivity().application as App).component.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println(fragment2ViewModel)
    }

    companion object {
        fun newInstance(): Fragment2 = Fragment2()
    }
}