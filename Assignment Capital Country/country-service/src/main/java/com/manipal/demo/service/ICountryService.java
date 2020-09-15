package com.manipal.demo.service;


import java.util.List;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;

public interface ICountryService {
	public Country getCountryByCountrycode(String countryCode);
	
	public Country getCountryName(String countryName);
	
	public void addOrUpdateCountry(Country country);
	
	public List<Country> getAllCountries();

}
