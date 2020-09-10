package com.manipal.exceptions;

public class ConversionMultipleNotFoundException extends RuntimeException {

		private String message;

		public ConversionMultipleNotFoundException(String message) {
			super(message);
		}
		
}
