package com.example.objectexception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
//AccountController.java
@RestController
@RequestMapping("/accounts")
public class AccountController {
 
@GetMapping("/check-customer")
public ResponseEntity<String> checkCustomerName(@RequestParam String customerName) {
    if (!customerName.toLowerCase().startsWith("a")) {
         throw new CustomerNotFoundException("Customer with name '" + customerName + "' not found.");
     }
     return ResponseEntity.ok("Customer found: " + customerName);
}
}