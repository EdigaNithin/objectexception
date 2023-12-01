package com.example.objectexception;

//CustomerNotFoundException.java
public class CustomerNotFoundException extends RuntimeException {
public CustomerNotFoundException(String message) {
     super(message);
}
}