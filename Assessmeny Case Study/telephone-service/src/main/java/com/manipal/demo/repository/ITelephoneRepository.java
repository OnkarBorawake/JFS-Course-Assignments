package com.manipal.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manipal.demo.model.Telephone;


@Repository
public interface ITelephoneRepository  extends JpaRepository<Telephone, String>{
	Telephone findByCustomerId(String customerId);
}

