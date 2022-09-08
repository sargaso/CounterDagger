package com.example.counterdagger.dagerapp.presentation.counter

class Counter() {

    private var counter = 0

    fun incrementCounter(){
         counter++
    }

    fun getCounter() = counter

}