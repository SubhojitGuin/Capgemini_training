package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gets the getter, setter, toString, equals, hashCode, requiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {

	private String employeeName;
	private Double employeeSalary;
	private Integer employeeDeptNo;
	private Long mobileNumber;
	private String email;
	private String gender;
	private String password;

}
