package com.spring.demo.bean;

public class City
{
    private Integer id;
    private String cityName;
    private Integer provinceId;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName( String cityName )
    {
        this.cityName = cityName;
    }

    public Integer getProvinceId()
    {
        return provinceId;
    }

    public void setProvinceId( Integer provinceId )
    {
        this.provinceId = provinceId;
    }

    public City( String cityName, Integer provinceId )
    {

        this.cityName = cityName;
        this.provinceId = provinceId;
    }

    public City( Integer id, String cityName, Integer provinceId )
    {

        this.id = id;
        this.cityName = cityName;
        this.provinceId = provinceId;
    }

    public City()
    {

    }
}
