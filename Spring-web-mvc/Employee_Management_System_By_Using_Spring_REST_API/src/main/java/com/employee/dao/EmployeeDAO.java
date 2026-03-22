package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.employee.dto.EmployeeDetails;
import com.employee.entity.EmployeeDetailsEntity;
import com.employee.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;
/*
 * @Repository is the combination of @Component annotation
 * It is used to create the bean of the DAO classes and it will tell that DAO class is used to perform the database operations by depending upon the repository
 */
@Repository
@RequiredArgsConstructor
public class EmployeeDAO {
	
	private final EmployeeRepository employeeRepository;
	
	/*
	 * We need Insert, Update, Delete, Select in the Employee Table
	 */
	
	public EmployeeDetailsEntity insertEmployeeDetails(EmployeeDetailsEntity employeeDetailsEntity) {
		return employeeRepository.saveAndFlush(employeeDetailsEntity);
	}
	
	public Long countAllEmployeeByEmailOrMobileNumber(String email, long mobileNumber) {
		return employeeRepository.countByEmailIgnoreCaseOrMobileNumber(email, mobileNumber);
	}
	
	public EmployeeDetailsEntity getEmployeeDetialsByUsingEmailidAndPassword(String emailid, String password) {
		return employeeRepository.findByEmailAndPassword(emailid, password).orElse(null);
	}

	public List<EmployeeDetailsEntity> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Long removeByEmail(String email) {
		return employeeRepository.removeByEmail(email);
	}

	public Long updateSalaryByMobileNumber(Double salary, Long mobileNumber) {
		return employeeRepository.updateSalaryByMobileNumber(salary, mobileNumber);
	}

	public Optional<EmployeeDetailsEntity> findById(int id) {
		return employeeRepository.findById(id);
	}
	
}
