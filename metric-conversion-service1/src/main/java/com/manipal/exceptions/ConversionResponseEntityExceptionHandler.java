package com.manipal.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//import com.example.demo.Exceptions.ExceptionResponse;
//import com.example.demo.Exceptions.MovieNotFoundException;

@ControllerAdvice
public class ConversionResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(ConversionMultipleNotFoundException.class)
	public ResponseEntity<ExceptionResponse> convNotFound(ConversionMultipleNotFoundException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
	
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}

}
