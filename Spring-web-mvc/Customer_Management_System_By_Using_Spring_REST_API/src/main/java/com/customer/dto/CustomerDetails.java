package com.customer.dto;

import lombok.Data;

@Data
public class CustomerDetails {
	
	private int id;
	private long mobileNumber;
	private long emailId;
	private String password;

}
