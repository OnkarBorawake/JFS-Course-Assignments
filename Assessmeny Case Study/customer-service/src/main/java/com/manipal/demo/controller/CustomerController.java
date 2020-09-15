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

import com.manipal.demo.exceptionpack.CustomerNotFoundException;
import com.manipal.demo.model.Customer;
import com.manipal.demo.model.Telephone;
import com.manipal.demo.proxy.TelephoneProxy;
import com.manipal.demo.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	public TelephoneProxy proxy;
	
	//save customer
	@PostMapping
	public String addCustomerDetails(@RequestBody Customer customer) {
		//System.out.println(customer);
		
		customerService.addOrUpdateCustomer(customer);
		return "Customer added successfully";		
	}
	
	//get all customers
	@GetMapping()
	public List<Customer> getAllCustomers() {
		List<Customer> customerlist = customerService.getAllCustomers();
		if(customerlist==null) {
			throw new CustomerNotFoundException("No customers found");
		}
		return customerlist;
	}
	
	//get specified customer
	@GetMapping("{customerId}")
	public Customer getCustomerById(@PathVariable String customerId) {
		
		Customer customer = customerService.getCustomerByCustomerid(customerId);
		
		if(customer==null) {			
			throw new CustomerNotFoundException("Customer id is invalid, Please enter correct customerId.");
		}
		return customer;
	}
	
	//update customer
	@PutMapping("update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customerDetails) {
		
		Customer customer = customerService.getCustomerByCustomerid(customerDetails.getCustomerId());
		
		if(customer!=null) {
		customer.setCustomerFirstname(customerDetails.getCustomerFirstname());
		customer.setCustomerLastname(customerDetails.getCustomerLastname());
		customer.setCustomerDob(customerDetails.getCustomerDob());
		customer.setCustomerEmail(customerDetails.getCustomerEmail());
		customerService.addOrUpdateCustomer(customer);
		}
		else {
			customerService.addOrUpdateCustomer(customerDetails);
		}
		
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
	
		return responseEntity;
	}
	
	//delete specified customer
	@GetMapping("delete/{customerId}")
	public String deleteCustomer(@PathVariable String customerId) {
		Customer customer = customerService.getCustomerByCustomerid(customerId);
		if(customer==null) {
			throw new CustomerNotFoundException("Customer entered is not present. So no need of deletion.");
			}
		customerService.deleteCustomer(customerId);
		return "Customer deleted successfully";
	}
	
	//display customers telephone details
	@GetMapping("{customerId}/telephone")
	public Telephone getTelephone(@PathVariable String customerId) {
		//Telephone telephone = proxy.retrieveTelephone(customerId);
		//customerService.addOrUpdateCustomer1(telephone);
			return proxy.retrieveTelephone(customerId);
	}
	
	
	
//	//extra work
//	@GetMapping("byFirstnameeAndLastname/{customerFirstname}/{customerLastname}")
//	public Customer getCustomerByCustomerFirstnameAndCustomerLastname(@PathVariable String customerFirstname,@PathVariable String customerLastname) {
//		Customer customer = customerService.getCustomerByCustomerFirstnameAndCustomerLastname(customerFirstname, customerLastname);
//		if(customer==null)
//			throw new CustomerNotFoundException("Customer not found, Please enter correct customerFirstname and customerLastname");
//		return customer;
//	}
}
