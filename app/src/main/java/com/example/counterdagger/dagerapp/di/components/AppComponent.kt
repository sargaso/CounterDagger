package com.example.counterdagger.dagerapp.di.components

import com.example.counterdagger.dagerapp.di.modules.AppModule
import com.example.counterdagger.dagerapp.presentation.counter.CounterFragment
import dagger.Component

@Component(modules = [AppModule::class])

interface AppComponent {
    fun inject(counterFragment: CounterFragment)
}