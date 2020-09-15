package com.manipal.demo.exceptionpack;


public class CountryNotFoundException extends RuntimeException{

	public CountryNotFoundException(String message) {
		super(message);
	}
}
