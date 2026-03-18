package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gets the getter, setter, toString, equals, hashCode, requiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {

	private int id;
	private String employeeName;
	private double employeeSalary;
	private int employeeDeptNo;
	private long mobileNumber;
	private String email;
	private String gender;

}
