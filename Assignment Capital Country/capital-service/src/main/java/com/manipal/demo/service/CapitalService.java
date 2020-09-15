package com.manipal.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Capital;
import com.manipal.demo.repository.ICapitalRepository;


@Service
public class CapitalService implements ICapitalService{

	@Autowired
	private ICapitalRepository repository;
	
	
	@Override
	public Capital getCapitalByZipcode(String zipcode) {
		return repository.findById(zipcode).orElse(null);
	}


	@Override
	public void addOrUpdatecapital(Capital capital) {
		repository.save(capital);
		
	}


	@Override
	public Capital getName(String name) {
		return repository.findByName(name);	}


	@Override
	public List<Capital> getAllCapitals() {
		return repository.findAll();
	}


	@Override
	public Capital getCapitalByCountryCode(String countryCode) {
		return repository.findByCountryCode(countryCode);
	}


}
