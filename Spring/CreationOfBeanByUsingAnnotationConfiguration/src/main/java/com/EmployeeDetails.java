package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("emp")
@ComponentScan(basePackages = "com")
public class EmployeeDetails {

	public EmployeeDetails() {
		super();
		System.out.println("EmployeeDetails Object is Created");
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee Name :- ABC");
		System.out.println("Employee Salary :- 650000");
	}
}
