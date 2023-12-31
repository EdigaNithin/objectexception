package com.example.objectexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
 
//CustomExceptionHandler.java
@ControllerAdvice
public class Accountservice {
 
@ExceptionHandler(CustomerNotFoundException.class)
public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException ex) {
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
}
}
 