package com.manipal.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manipal.demo.model.Country;


@Repository
public interface ICountryRepository  extends JpaRepository<Country, String>{
	Country findByCountryName(String countryName);
	
}

