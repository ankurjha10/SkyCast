package com.weather.skycast.service;

import com.weather.skycast.dto.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.base-url}")
    private String baseUrl;

    public WeatherResponse getWeather(String location) {
        String finalAPI = baseUrl + "current?access_key=" + apiKey + "&query=" + location;
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        return response.getBody();
    }
}
