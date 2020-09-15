package com.manipal.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.Capital;


@Repository
public interface ICapitalRepository  extends JpaRepository<Capital, String>{
	Capital findByName(String name);
	Capital findByCountryCode(String countryCode);
	
}

