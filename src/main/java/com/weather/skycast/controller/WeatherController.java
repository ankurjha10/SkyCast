package com.weather.skycast.controller;

import com.weather.skycast.dto.WeatherResponse;
import com.weather.skycast.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/getWeather")
    public ResponseEntity<WeatherResponse> getWeather(@RequestParam String city) {
        return ResponseEntity.ok(weatherService.getWeather(city));
    }
}
