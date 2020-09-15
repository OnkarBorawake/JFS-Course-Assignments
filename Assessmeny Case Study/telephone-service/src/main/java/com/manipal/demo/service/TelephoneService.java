package com.manipal.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.manipal.demo.model.Telephone;
import com.manipal.demo.repository.ITelephoneRepository;

@Service
public class TelephoneService implements ITelephoneService{

	@Autowired
	private ITelephoneRepository repository;

	public void updateTelephone(Telephone telephone) {
		repository.save(telephone);

	}
	@Override
	public void addOrUpdateTelephone(Telephone telephone) {
		repository.save(telephone);		
	}

	@Override
	public List<Telephone> getAllTelephones() {
		return repository.findAll();
	}

	@Override
	public Telephone getTelephoneByTelephoneId(String telephoneId) {
		return repository.findById(telephoneId).orElse(null);
	}

	@Override
	public void deleteTelephone(String telephoneId) {
		repository.deleteById(telephoneId);		
	}
	@Override
	public Telephone getTelephoneByCustomerId(String customerId) {
		return repository.findByCustomerId(customerId);
	}
	
	



}
