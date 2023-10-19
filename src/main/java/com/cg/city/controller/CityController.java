package com.cg.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.city.entity.City;
import com.cg.city.service.CityService;

@RestController
@RequestMapping("/cityapi")
public class CityController {

	@Autowired
	private CityService cs;
	
	@PostMapping("/add")
	public String addCity(@RequestBody City city)
	{
		return cs.addCity(city);
	}
	
	@GetMapping("/")
	public List<City> getCityList()
	{
		return cs.getAllCities();
	}
	
}
