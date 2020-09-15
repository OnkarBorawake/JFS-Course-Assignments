package com.manipal.demo.exceptionpack;


public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
