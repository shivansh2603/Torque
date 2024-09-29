package com.example.torque.Repository

import com.example.torque.Server.ApiServices

class WeatherRepository(val api:ApiServices) {
    fun getCurrentWeather(lat:Double,lon:Double,unit:String)=
        api.getCurrentWeather(lat,lon,unit,"749cb7fcb8499c1911f13e089b4571e3")
}