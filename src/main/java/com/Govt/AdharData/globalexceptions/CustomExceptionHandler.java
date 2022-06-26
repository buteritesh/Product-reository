package com.Govt.AdharData.globalexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=AdharNotValid.class)
	public ResponseEntity<ErrorDetails>AdharNotValid(AdharNotValid exception){
		
		  ErrorDetails details = new ErrorDetails(exception.getMessage(),"Adhar not valid : ");
		
		   return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
		
	}

}
