package com.gravityer.exception;

@ControllerAdvice
public class ProductExceptionHandler {
	
	 @ExceptionHandler(value = ResourceNotFoundException.class)
	   public ResponseEntity<Object> exception(ResourceNotFoundException exception) {
	      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	   }
	 
	 
	 
	}