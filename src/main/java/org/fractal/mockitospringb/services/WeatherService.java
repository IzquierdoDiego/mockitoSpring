package org.fractal.mockitospringb.services;

import org.fractal.mockitospringb.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeather(){
        Weather weather = new Weather();
        weather.setMinTemp(10);
        weather.setMaxTemp(22);
        weather.setStatus("Cloudy");
        return weather;
    }
}
