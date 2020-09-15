package com.manipal.demo.exceptionpack;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.manipal.demo.model.Country;

@ControllerAdvice
public class CountryResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CountryNotFoundException.class)
	public ResponseEntity<ExceptionResponse> movieNotFound(CountryNotFoundException exception) {
		ExceptionResponse response= new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
		return  new ResponseEntity<>(response, HttpStatus.NOT_FOUND );
		
		
	}
}
