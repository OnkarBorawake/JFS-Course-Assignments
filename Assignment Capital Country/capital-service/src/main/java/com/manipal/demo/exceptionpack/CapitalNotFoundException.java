package com.manipal.demo.exceptionpack;


public class CapitalNotFoundException extends RuntimeException{

	public CapitalNotFoundException(String message) {
		super(message);
	}
}
