package com.customer.dto;

import lombok.Data;

@Data
public class CustomerDetails {
	
	private int id;
	private long mobileNumber;
	private String email;
	private String password;
	private String name;

}
