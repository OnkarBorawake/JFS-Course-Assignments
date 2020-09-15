package com.manipal.demo.service;


import java.util.List;

import com.manipal.demo.model.Telephone;

public interface ITelephoneService {
	
	public void addOrUpdateTelephone(Telephone telephone);

	public List<Telephone> getAllTelephones();

	public Telephone getTelephoneByTelephoneId(String telephoneId);

	public void deleteTelephone(String telephoneId);

	public Telephone getTelephoneByCustomerId(String customerId);

}
