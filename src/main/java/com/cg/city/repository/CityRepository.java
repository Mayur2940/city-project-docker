package com.cg.city.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.city.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
