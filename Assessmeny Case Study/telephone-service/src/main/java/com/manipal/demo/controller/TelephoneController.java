package com.manipal.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.exceptionpack.TelephoneNotFoundException;
import com.manipal.demo.model.Telephone;
import com.manipal.demo.service.ITelephoneService;


@RestController
@RequestMapping
public class TelephoneController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ITelephoneService telephoneService;
	
	//save telephone
	@PostMapping
	public String addTelephoneDetails(@RequestBody Telephone telephone) {
		//System.out.println(telephone);
		
		telephoneService.addOrUpdateTelephone(telephone);
		return "Telephone added successfully";		
	}
	
	//get all telephone details
	@GetMapping
	public List<Telephone> getAllTelephones() {
		List<Telephone> telephonelist = telephoneService.getAllTelephones();
		if(telephonelist==null) {
			throw new TelephoneNotFoundException("No telephones found");
		}
		return telephonelist;
	}
	
	//get details of the telephone
	@GetMapping("{telephoneId}")
	public Telephone getCustomerById(@PathVariable String telephoneId) {
		
		Telephone telephone = telephoneService.getTelephoneByTelephoneId(telephoneId);
		
		if(telephone==null) {			
			throw new TelephoneNotFoundException("Telephone id is invalid, Please enter correct telephoneId.");
		}
		return telephone;
	}
	
	//update telephone
	@PutMapping("update")
	public ResponseEntity<Telephone> updateCustomer(@RequestBody Telephone telephoneDetails) {
		
		Telephone telephone = telephoneService.getTelephoneByTelephoneId(telephoneDetails.getTelephoneId());
		
		if(telephone!=null) {
			telephone.setMobileNumber(telephoneDetails.getMobileNumber());
			telephone.setTelephoneNumber(telephoneDetails.getTelephoneNumber());
			telephoneService.addOrUpdateTelephone(telephone);
		}
		else {
			telephoneService.addOrUpdateTelephone(telephoneDetails);
		}	
		ResponseEntity<Telephone> responseEntity = new ResponseEntity<>(telephone, HttpStatus.OK);	
		return responseEntity;
	}
	
	//delete specified telephone details
	@GetMapping("delete/{telephoneId}")
	public String deleteTelephone(@PathVariable String telephoneId) {
		Telephone telephone = telephoneService.getTelephoneByTelephoneId(telephoneId);
		if(telephone==null) {
			throw new TelephoneNotFoundException("Telephone entered is not present. So no need of deletion.");
			}
		telephoneService.deleteTelephone(telephoneId);
		return "Telephone deleted successfully";
	}
	
	
	@GetMapping("{customerId}/telephone")
	public Telephone findTelephoneByCustomerId(@PathVariable String customerId) {
		
		Telephone telephone = telephoneService.getTelephoneByCustomerId(customerId);
		if(telephone==null)
		{
			throw new TelephoneNotFoundException("Customer id is invalid. Please enter correct customerId.");
		}
		return telephone;
	}
}
