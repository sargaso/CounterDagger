package com.example.counterdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterdagger.dagerapp.presentation.counter.CounterFragment
import com.example.counterdagger.dagerapp.utils.extensions.navigateToFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragment(fragment = CounterFragment())
    }
}