package com.example.counterdagger.dagerapp.presentation.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.counterdagger.dagerapp.common.App
import com.example.counterdagger.databinding.FragmentCounterBinding
import javax.inject.Inject

class CounterFragment() : Fragment(){

    private var binding: FragmentCounterBinding? = null
    @Inject
    lateinit var counter: Counter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCounterBinding
            .inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setListeners()
        (requireContext().applicationContext as App).appComponent?.inject(this)
    }

    private fun setListeners() {
        binding?.btnIncramentCounter?.setOnClickListener {
            counter.incrementCounter()
            binding?.tvCounter?.text = counter.getCounter().toString()
        }
    }
}