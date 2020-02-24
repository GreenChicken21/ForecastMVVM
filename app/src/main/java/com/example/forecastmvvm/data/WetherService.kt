package com.example.forecastmvvm.data

import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY ="16c8ed77fd6ba462ffb871a429b1d526"

// http://api.weatherstack.com/current?access_key=16c8ed77fd6ba462ffb871a429b1d526&query=Sarajevo


interface WetherService {

    @GET("current")
    fun getCurrentWeather(){

    }

}