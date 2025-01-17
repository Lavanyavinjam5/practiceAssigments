package com.example.weatherappretrofitnavigation.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.weatherappretrofitnavigation.R
import com.example.weatherappretrofitnavigation.databinding.FragmentWeatherDetailsBinding


class MainFragment : Fragment(R.layout.fragment_weather_details) {

    private lateinit var binding: FragmentWeatherDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWeatherDetailsBinding.bind(view)

        // Get weather data from arguments
        val weatherData = arguments?.getString("weather_data")
        binding.tvWeatherDetails.text = weatherData ?: "No weather details available"

        // Back button functionality
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}