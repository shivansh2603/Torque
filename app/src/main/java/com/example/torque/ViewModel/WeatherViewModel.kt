package com.example.torque.ViewModel

import androidx.lifecycle.ViewModel
import com.example.torque.Repository.WeatherRepository
import com.example.torque.Server.ApiClient
import com.example.torque.Server.ApiServices

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double,lng: Double,unit: String)= repository.getCurrentWeather(lat,lng,unit)
}