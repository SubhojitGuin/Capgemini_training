package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeInfo {
	
	private String employeeName;
	private Double employeeSalary;
	private Integer employeeDeptNo;
	private String gender;

}
