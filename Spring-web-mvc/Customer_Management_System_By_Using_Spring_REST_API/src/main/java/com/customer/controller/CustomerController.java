package com.customer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDetails;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@PostMapping("/registration")
	public CustomerDetails registration(@RequestBody CustomerDetails customerDetails) {
		return customerDetails;
	}
	
	@GetMapping("/login")
	public long login(@RequestParam long mobileNumber) {
		return mobileNumber;
	}
	
	@GetMapping("/getAllCustomers")
	public List<CustomerDetails> getAllCustomer() {
		return null;
	}
	
	@PutMapping("/updateEmail")
	public void udpateEmailByPassword(@RequestParam String email, @RequestParam String password) {
		
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomerById(@PathParam("id") int id) {
		
	}

}
