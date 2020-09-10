package com.manipal.service;

import com.manipal.model.ConversionRate;

public interface IConversionRateService {
	public ConversionRate getConversionbyID(long conversion);
	public ConversionRate getConversion(String from , String to);
	public void addConversion(ConversionRate conversion);
}
