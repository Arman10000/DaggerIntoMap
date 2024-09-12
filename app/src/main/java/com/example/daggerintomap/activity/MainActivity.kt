package com.example.daggerintomap.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerintomap.R
import com.example.daggerintomap.fragment1.Fragment1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, Fragment1.newInstance())
                .commit()
        }
    }
}