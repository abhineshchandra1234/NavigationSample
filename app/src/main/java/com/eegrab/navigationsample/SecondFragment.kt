package com.eegrab.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eegrab.navigationsample.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        binding = FragmentSecondBinding.bind(view)
        binding.tv2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment)
        }

        return view
    }


}