package com.customer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDetails;
import com.customer.dto.CustomerInfo;
import com.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
	
	private final CustomerService customerService;
	
	@PostMapping("/registration")
	public ResponseEntity<String> registration(@RequestBody CustomerDetails customerDetails) {
		customerService.customerRegistration(customerDetails);
		return new ResponseEntity<>("Customer registered successfully.", HttpStatus.CREATED);
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestParam long mobileNumber) {
		return new ResponseEntity<>(customerService.customerLogin(mobileNumber), HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<CustomerInfo>> getAllCustomer() {
		return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
	}
	
	@PutMapping("/updatePassword")
	public ResponseEntity<Void> udpatePasswordByEmail(@RequestParam String email, @RequestParam String password) {
		customerService.updatePasswordByEmail(password, email);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<Void> deleteCustomerById(@PathVariable int id) {
		customerService.deleteCustomerById(id);
		return ResponseEntity.noContent().build();
	}

}
