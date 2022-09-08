package com.example.counterdagger.dagerapp.di.modules

import com.example.counterdagger.dagerapp.presentation.counter.Counter
import dagger.Module
import dagger.Provides

@Module


class AppModule {

    @Provides
    fun provideCounter(): Counter {
        return Counter()
    }



}

