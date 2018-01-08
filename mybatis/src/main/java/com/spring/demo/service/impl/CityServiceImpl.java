package com.spring.demo.service.impl;

import com.spring.demo.bean.City;
import com.spring.demo.dao.CityMapper;
import com.spring.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService
{   @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> getCities()
    {
        return this.cityMapper.getAll();
    }
}
