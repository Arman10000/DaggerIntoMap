package com.example.daggerintomap.fragment1

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.daggerintomap.App
import com.example.daggerintomap.R
import com.example.daggerintomap.factory.ViewModelSavedStateFactory
import com.example.daggerintomap.fragment2.Fragment2
import javax.inject.Inject

class Fragment1 : Fragment(R.layout.fragment_1) {

    @Inject
    lateinit var viewModelSavedStateFactory: ViewModelSavedStateFactory

    private val fragment1ViewModel: Fragment1ViewModel by viewModels {
        viewModelSavedStateFactory
    }

    override fun onAttach(context: Context) {
        (requireActivity().application as App).component.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println(fragment1ViewModel)

        requireActivity().findViewById<Button>(R.id.button).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragmentContainer, Fragment2.newInstance())
                .commit()
        }

    }

    companion object {
        fun newInstance(): Fragment1 = Fragment1()
    }
}