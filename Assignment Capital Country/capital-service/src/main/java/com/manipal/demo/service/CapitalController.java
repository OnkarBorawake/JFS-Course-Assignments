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

import com.manipal.demo.exceptionpack.CapitalNotFoundException;
import com.manipal.demo.model.Capital;


@RestController
public class CapitalController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ICapitalService capitalService;
	
	@PostMapping
	public String addCapitalDetails(@RequestBody Capital capital) {
		System.out.println(capital);
		
		capitalService.addOrUpdatecapital(capital);
		return "Capital added successfully";		
	}
	
	@GetMapping("capital-service/zipcode/{zipcode}")
	public Capital getCapitalById(@PathVariable String zipcode) {
		
		Capital capital = capitalService.getCapitalByZipcode(zipcode);
		
		if(capital!=null) {
			capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
			capitalService.addOrUpdatecapital(capital);
		}
		else {
			throw new CapitalNotFoundException("Capital zipcode is invalid, Please enter correct zipcode.");
		}
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		return capital;
	}
	
	@GetMapping("capital-service/capital/{name}")
	public Capital getName(@PathVariable String name) {
		
		Capital capital = capitalService.getName(name);
		
		if(capital!=null) {
			capital.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			
			capitalService.addOrUpdatecapital(capital);
		}
		else {
			throw new CapitalNotFoundException("Capital name is invalid, Please enter correct capitalname.");
		}
		return capital;
	}
	@PostMapping("capital-service/all")
	public List<Capital> getAllCapitals() {
		List<Capital> capitallist = capitalService.getAllCapitals();
		if(capitallist==null) {
			throw new CapitalNotFoundException("No capitals found");
		}
		return capitallist;
	}
	
	@GetMapping("{countryCode}/capital")
	public Capital findCapitalByCountryCode(@PathVariable String countryCode) {
		
		Capital capital = capitalService.getCapitalByCountryCode(countryCode);
		if(capital==null)
		{
			throw new CapitalNotFoundException("Country code is invalid. Please enter correct country code.");
		}
		return capital;
	}
}
