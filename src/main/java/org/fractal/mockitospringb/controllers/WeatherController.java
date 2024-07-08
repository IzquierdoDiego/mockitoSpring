package org.fractal.mockitospringb.controllers;

import org.fractal.mockitospringb.models.Weather;
import org.fractal.mockitospringb.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/api/weather")
    public Weather getweather(){

        return weatherService.getWeather();
    }

}
