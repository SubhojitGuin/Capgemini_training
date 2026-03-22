package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_details")
public class EmployeeDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name", nullable = false)
	private String employeeName;
	
	@Column(name = "emp_mobile_number", unique = true, nullable = false, length = 10)
	private Long mobileNumber;
	
	@Column(name = "emp_deptno", nullable = false)
	private Integer employeeDeptNo;
	
	@Column(name = "emp_salary", nullable = false)
	private Double employeeSalary;
	
	@Column(name = "emp_email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "emp_gender", nullable = false)
	private String gender;
	
	@Column(name = "emp_password", nullable = false)
	private String password;

}
