package com.manipal.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Customer;
import com.manipal.demo.model.Telephone;


@Repository
public interface ICustomerRepository  extends JpaRepository<Customer, String>{

	void save(Telephone retrieveTelephone);
//	Customer findByCustomerFirstname(String customerFirstname);
//	Customer findByCustomerLastname(String customerLastname);
}

