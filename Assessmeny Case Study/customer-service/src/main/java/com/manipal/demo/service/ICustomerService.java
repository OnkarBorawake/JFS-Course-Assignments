package com.manipal.demo.service;


import java.util.List;

import com.manipal.demo.model.Customer;
import com.manipal.demo.model.Telephone;

public interface ICustomerService {
	
	public void addOrUpdateCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public Customer getCustomerByCustomerid(String customerId);
			
	public void deleteCustomer(String customerId);

	public void addOrUpdateCustomer1(Telephone retrieveTelephone);

	//public Customer getCustomerByCustomerFirstnameAndCustomerLastname(String customerFirstname, String customerLastname);


}
