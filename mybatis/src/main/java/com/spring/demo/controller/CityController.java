package com.spring.demo.controller;

import com.spring.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController
{
    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public List test()
    {
        return this.cityService.getCities();
    }
}
