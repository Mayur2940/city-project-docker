package com.cg.city.dao;

import java.util.List;

import com.cg.city.entity.City;

public interface CityDao {

	public String addCity(City city);
	
	List<City> getAllCities();
}
