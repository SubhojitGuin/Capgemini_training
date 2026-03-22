package com.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.customer.dto.CustomerDetails;
import com.customer.dto.CustomerInfo;
import com.customer.entity.CustomerEntity;
import com.customer.exception.DuplicateCustomerException;
import com.customer.exception.NotFoundException;
import com.customer.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	
	public void customerRegistration(CustomerDetails customerDetails) {
		if (customerRepository.findByEmailOrMobileNumberOrPassword(customerDetails.getEmail(), customerDetails.getMobileNumber(), customerDetails.getPassword()).isPresent()) {
			throw new DuplicateCustomerException("Duplicate Customer exists");
		}
		
		CustomerEntity customerEntity = new CustomerEntity();
		
		customerEntity.setEmail(customerDetails.getEmail());
		customerEntity.setMobileNumber(customerDetails.getMobileNumber());
		customerEntity.setName(customerDetails.getName());
		customerEntity.setPassword(customerDetails.getPassword());
		
		customerRepository.save(customerEntity);
	}
	
	public String customerLogin(long mobileNumber) {
		Optional<CustomerEntity> optionalCustomer = customerRepository.findByMobileNumber(mobileNumber);
		
		if (optionalCustomer.isEmpty()) {
			throw new NotFoundException("No such user with this mobile number exists");
		}
		
		return "Logged in successfully";
	}
	
	public List<CustomerInfo> getAllCustomers() {
		return customerRepository.findAll().stream()
				.map(cust -> new CustomerInfo(
						cust.getName(),
						cust.getMobileNumber()
				)).toList();
	}

	public void updatePasswordByEmail(String password, String email) {
		Long count = customerRepository.updatePasswordByEmail(email, password);
		
		if (count == 0) {
			throw new NotFoundException("No user found with this email");
		}
	}

	public void deleteCustomerById(int id) {
		Long count = customerRepository.removeById(id);
		
		if (count == 0) {
			throw new NotFoundException("No user found with this id");
		}
	}

}
