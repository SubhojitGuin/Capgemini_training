package com;

import org.MyApis;

public class CustomerDetails {
	
	private int id;
	private String name;
	private long mobileNumber;
	private String emailId;
	
	public void validateMobileNumber(long mobileNumber) {
		
		MyApis myApis = new MyApis();
		int length = myApis.findTheLengthOfTheNumber(mobileNumber);
		
		if (length == 10) {
			System.out.println("Valid Mobile Number");
			this.mobileNumber = mobileNumber;
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}
	
	public void validateEmailId(String emailId) {
		MyApis myApis = new MyApis();
		boolean isValidEmail = myApis.checkValidEmail(emailId);
		
		if (isValidEmail) {
			System.out.println("Valid Email Id");
			this.emailId = emailId;
		} else {
			System.out.println("Invalid Email Id");
		}
	}
	
	public static void main(String[] args) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.validateEmailId("subho@gmail.com");
		customerDetails.validateMobileNumber(9123963164L);
	}

}
