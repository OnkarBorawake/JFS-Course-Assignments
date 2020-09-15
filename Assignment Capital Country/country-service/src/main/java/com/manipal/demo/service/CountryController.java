package com.manipal.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.exceptionpack.CountryNotFoundException;
import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.proxy.CapitalProxy;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ICountryService countryService;
	
	@Autowired
	public CapitalProxy proxy;
	
	
	@PostMapping
	public String addCountryDetails(@RequestBody Country country) {
		System.out.println(country);
		
		countryService.addOrUpdateCountry(country);
		return "Country added successfully";		
	}
	
	@GetMapping("country-service/{countryCode}")
	public Country getCountryById(@PathVariable String countryCode) {
		
		Country country = countryService.getCountryByCountrycode(countryCode);
		
		if(country!=null) {
		//	Capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
			countryService.addOrUpdateCountry(country);
		}
		else {
			throw new CountryNotFoundException("Country code is invalid, Please enter correct countrycode.");
		}
		return country;
	}
	
	@GetMapping("country-service/country1/{countryName}")
	public Country getcountryName(@PathVariable String countryName) {
		
		Country country = countryService.getCountryName(countryName);
		
		if(country!=null) {
		//Capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
			countryService.addOrUpdateCountry(country);
		}
		else {
			throw new CountryNotFoundException("Country name is invalid, Please enter correct country name.");
		}
		return country;
	}
	
	@PostMapping("country-service/all")
	public List<Country> getAllCountries() {
		List<Country> countrylist = countryService.getAllCountries();
		if(countrylist==null) {
			throw new CountryNotFoundException("No countries found");
		}
		return countrylist;
	}
	
//	@GetMapping("country-service/country1/{countryName}")
//	public Country findCapitalByCountryCode(@PathVariable String countryName) {
//		
//		Country country = countryService.getCountryName(countryName);
//		String countryCode = country.getCountryCode();
//		Country bean = proxy.retrieveCapital(countryCode);
//		if(country.getCountryCode() == bean.getCountryCode()) {
//			country.setLanguage(bean.getLanguage());
//			country.setName(bean.getName());
//			country.setPopulation(bean.getPopulation());
//			country.setZipcode(bean.getZipcode());
//			country.setPort(bean.getPort());
//			countryService.addOrUpdateCountry(country);
//		}
//		return country;
//	}
	
	@GetMapping("{countryCode}/capital")
	public Capital getCapital(@PathVariable String countryCode) {
		return proxy.retrieveCapital(countryCode);
	}
}
