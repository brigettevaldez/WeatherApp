package com.example.weatherapp.data

data class ForecastResult(val city: City, val list: List<Forecast>)

data class City(val id: Long, val name: String, val coord: Coordinates, val country: String, val population: Int)

data class Coordinates(val log: Float, val lat: Float)

data class Forecast(val dt: Long, val temp: Temperature, val pressure: Float,
                    val humidity: Int, val weather: List<Weather>, val speed: Float,
                    val degree: Int, val clouds: Int, val rain: Float)

data class Temperature(val day: Float, val min: Float, val max: Float,
                       val night: Float, val degree: Int, val clouds: Int,
                       val rain: Float)

data class Weather(val id: Long, val main: String, val description: String, val icon: String)


