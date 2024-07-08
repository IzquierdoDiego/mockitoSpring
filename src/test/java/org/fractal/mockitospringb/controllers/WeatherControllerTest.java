package org.fractal.mockitospringb.controllers;

import org.fractal.mockitospringb.models.Weather;
import org.fractal.mockitospringb.services.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @Test
    public void getWeather(){

        Weather weather  = new Weather();
        weather.setStatus("rainy");
        weather.setMinTemp(232);
        weather.setMaxTemp(1244);

        when(weatherService.getWeather()).thenReturn(weather);

        Weather result = weatherController.getweather();

        verify(weatherService, times(1)).getWeather();
        Assertions.assertEquals(weather, result);

    }

}
