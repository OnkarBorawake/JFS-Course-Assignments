package com.manipal.exceptions;

public class DuplicateConversionIdException extends RuntimeException {
	private String message;

	public DuplicateConversionIdException(String message) {
		super(message);
	}
}
