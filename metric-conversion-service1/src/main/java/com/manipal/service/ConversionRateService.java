package com.manipal.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.exceptions.ConversionMultipleNotFoundException;
import com.manipal.model.ConversionRate;
import com.manipal.repository.IConversionRepository;


@Service
public class ConversionRateService implements IConversionRateService {
	
	@Autowired
	private IConversionRepository repository;
	
	@Override
	public ConversionRate getConversion(String from , String to) {
		List<ConversionRate> list = new ArrayList<ConversionRate>();
		list = repository.findByFrom(from);
		int flag = 0;
		if(list!=null) {
			for(ConversionRate c : list) {
				if(c.getTo().equalsIgnoreCase(to)) {
					flag=1;
					return c;
				}
			}	
		}
		else
			throw new ConversionMultipleNotFoundException("The Conversion Factor for this conversion doesn't exist in the Database!");
		if(flag==0)
			throw new ConversionMultipleNotFoundException("The Conversion Factor for this conversion doesn't exist in the Database!");
	return null;
	}

	@Override
	public void addConversion(ConversionRate conversion) {
		repository.save(conversion);
		
	}

	@Override
	public ConversionRate getConversionbyID(long l) {
		return repository.findById(l).orElse(null);
	}
	
}
