package com.weather.skycast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherResponse{
    private Location location;
    private Current current;

    @Data
    public static class Location{
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;

        @JsonProperty("timezone_id")
        private String timezoneId;

        private String localtime;

        @JsonProperty("utc_offset")
        private String utcOffset;
    }

    @Data
    public static class Current{

        @JsonProperty("observation_time")
        private String observationTime;

        private int temperature;

        @JsonProperty("weather_code")
        private int weatherCode;

        @JsonProperty("weather_icons")
        private ArrayList<String> weatherIcons;

        @JsonProperty("weather_descriptions")
        private ArrayList<String> weatherDescriptions;

        @JsonProperty("wind_speed")
        private int windSpeed;

        @JsonProperty("wind_degree")
        private int windDegree;

        @JsonProperty("wind_dir")
        private String windDir;

        private int pressure;
        private int precip;
        private int humidity;
        private int cloudcover;
        private int feelslike;

        @JsonProperty("uv_index")
        private int uvIndex;

        private int visibility;

        @JsonProperty("is_day")
        private String isDay;
    }
}