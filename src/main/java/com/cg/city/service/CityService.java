package com.cg.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.city.dao.CityDao;
import com.cg.city.entity.City;
import com.cg.city.repository.CityRepository;

public class CityService implements CityDao{

	@Autowired
	private CityRepository cr;
	
	public String addCity(City city) {
		cr.save(city);
		return "City Updated successfully";
	}

	
	public List<City> getAllCities() {
		
		return cr.findAll();
		
	}

	
	
}
