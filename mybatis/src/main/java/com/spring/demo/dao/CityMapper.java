package com.spring.demo.dao;

import com.spring.demo.bean.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper
{
    @Select("select * from city")
    List<City> getAll();
}
