package com.manipal.demo.service;


import java.util.List;

import com.manipal.demo.model.Capital;

public interface ICapitalService {
	public Capital getCapitalByZipcode(String zipcode);

	public void addOrUpdatecapital(Capital capital);

	public Capital getCapitalByCountryCode(String countryCode);
	
	public Capital getName(String name);

	public List<Capital> getAllCapitals();
}
