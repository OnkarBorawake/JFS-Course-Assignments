package com.manipal.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.demo.model.Customer;
import com.manipal.demo.model.Telephone;
import com.manipal.demo.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private ICustomerRepository repository;
	
	public void updateCustomer(Customer customer) {
		repository.save(customer);

	}
	@Override
	public void addOrUpdateCustomer(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public Customer getCustomerByCustomerid(String customerId) {
		return repository.findById(customerId).orElse(null);
	}

	@Override
	public void deleteCustomer(String customerId) {
		repository.deleteById(customerId);
		
	}
	@Override
	public void addOrUpdateCustomer1(Telephone retrieveTelephone) {
		repository.save(retrieveTelephone);		
	}

//	@Override
//	public Customer getCustomerByCustomerFirstnameAndCustomerLastname(String customerFirstname,
//			String customerLastname) {
//		Customer c1 = repository.findByCustomerFirstname(customerFirstname);
//		Customer c2 = repository.findByCustomerLastname(customerLastname);
//		if(c1.equals(c2))
//		{
//			return c1;
//		}
//		else return null;
//	}
	

}
