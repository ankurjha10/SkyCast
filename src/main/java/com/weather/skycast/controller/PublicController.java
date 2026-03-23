package com.weather.skycast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Sky Cast API is up and running!";
    }
}
