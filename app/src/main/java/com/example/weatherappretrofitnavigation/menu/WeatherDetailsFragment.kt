package com.example.weatherappretrofitnavigation.menu
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.weatherappretrofitnavigation.R
import com.example.weatherappretrofitnavigation.databinding.FragmentWeatherDetailsBinding


class WeatherDetailsFragment : Fragment(R.layout.fragment_weather_details) {

    private lateinit var binding: FragmentWeatherDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWeatherDetailsBinding.bind(view)

        val weatherData = arguments?.getString("weather_data")
        binding.tvWeatherDetails.text = weatherData
    }
}