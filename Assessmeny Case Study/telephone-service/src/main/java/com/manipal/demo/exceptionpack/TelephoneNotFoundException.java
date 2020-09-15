package com.manipal.demo.exceptionpack;


public class TelephoneNotFoundException extends RuntimeException{

	public TelephoneNotFoundException(String message) {
		super(message);
	}
}
