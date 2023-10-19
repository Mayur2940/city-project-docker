package com.cg.city.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CityEntity {

	@Id
	private int cityPinCode;
	private String cityName;
	private long cityPopulation;
	
	
}
