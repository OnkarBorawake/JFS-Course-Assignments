package com.manipal.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Country;
import com.manipal.demo.repository.ICountryRepository;


@Service
public class CountryService implements ICountryService{

	@Autowired
	private ICountryRepository repository;
	
	@Override
	public void addOrUpdateCountry(Country country) {
		repository.save(country);
		
	}

	@Override
	public Country getCountryByCountrycode(String countryCode) {
		return repository.findById(countryCode).orElse(null);
	}

	@Override
	public Country getCountryName(String countryName) {
		return repository.findByCountryName(countryName);
	}

	@Override
	public List<Country> getAllCountries() {
			return repository.findAll();
	}



}
