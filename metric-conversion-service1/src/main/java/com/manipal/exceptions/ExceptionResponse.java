package com.manipal.exceptions;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private String message;
	private LocalDateTime timestamp;
	
	public ExceptionResponse() {
		
	}
	
	public ExceptionResponse(String message, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.timestamp = timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
