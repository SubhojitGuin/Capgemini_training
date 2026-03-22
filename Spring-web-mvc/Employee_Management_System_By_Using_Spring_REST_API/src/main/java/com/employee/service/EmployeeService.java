package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeDetails;
import com.employee.dto.EmployeeInfo;
import com.employee.entity.EmployeeDetailsEntity;
import com.employee.exception.AuthenticationException;
import com.employee.exception.DuplicateUserException;
import com.employee.exception.NotFoundException;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

/*
 * @Service is the combination of @Component annotation
 * It is used to create the bean for service classes and it will tell you that the class is used to write business logic to validate and create the structure of the response
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	private final EmployeeDAO employeeDAO;
	
	public EmployeeInfo employeeRegistration(EmployeeDetails employeeDetails) {
		
		if (employeeDAO.countAllEmployeeByEmailOrMobileNumber(employeeDetails.getEmail(), employeeDetails.getMobileNumber()) > 0) {
			throw new DuplicateUserException("Duplicate User exist");
		}
		
		EmployeeDetailsEntity employeeDetailsEntity = new EmployeeDetailsEntity();
		
		employeeDetailsEntity.setEmail(employeeDetails.getEmail());
		employeeDetailsEntity.setEmployeeDeptNo(employeeDetails.getEmployeeDeptNo());
		employeeDetailsEntity.setEmployeeName(employeeDetails.getEmployeeName());
		employeeDetailsEntity.setEmployeeSalary(employeeDetails.getEmployeeSalary());
		employeeDetailsEntity.setGender(employeeDetails.getGender());
		employeeDetailsEntity.setMobileNumber(employeeDetails.getMobileNumber());
		employeeDetailsEntity.setPassword(employeeDetails.getPassword());
		
		EmployeeDetailsEntity emp = employeeDAO.insertEmployeeDetails(employeeDetailsEntity);
		return new EmployeeInfo(emp.getEmployeeName(), emp.getEmployeeSalary(), emp.getEmployeeDeptNo(), emp.getGender());
	}
	
	public String employeeLogin(String email, String password) {
		EmployeeDetailsEntity employeeDetailsEntity = employeeDAO.getEmployeeDetialsByUsingEmailidAndPassword(email, password);
		
		if (employeeDetailsEntity == null) {
			throw new AuthenticationException("Incorrect credentials");
		}
		
		return "Logged in successfully";
	}

	public List<EmployeeDetails> getAllEmployeeDetails() {
		return employeeDAO.findAllEmployees().stream()
				.map(emp -> new EmployeeDetails(
						emp.getEmployeeName(),
						emp.getEmployeeSalary(),
						emp.getEmployeeDeptNo(),
						emp.getMobileNumber(),
						emp.getEmail(), 
						emp.getGender(),
						emp.getPassword())
				).toList();
	}
	
	@Transactional
	public void deleteEmployeeByEmail(String email) {
		Long count = employeeDAO.removeByEmail(email);
		
		if (count == 0) {
			throw new NotFoundException("No user found with this email");
		}
	}

	@Transactional
	public void udpateSalaryByMobileNumber(Double salary, Long mobileNumber) {
		Long count = employeeDAO.updateSalaryByMobileNumber(salary, mobileNumber);
		
		if (count == 0) {
			throw new NotFoundException("No user found with this mobile number");
		}
	}

	public EmployeeDetails getEmployeeById(int id) {
		 Optional<EmployeeDetailsEntity> emp = employeeDAO.findById(id);
		 
		 if (emp.isEmpty()) {
			 throw new NotFoundException("No such user exists");
		 }
		 
		 return new EmployeeDetails(
					emp.get().getEmployeeName(),
					emp.get().getEmployeeSalary(),
					emp.get().getEmployeeDeptNo(),
					emp.get().getMobileNumber(),
					emp.get().getEmail(), 
					emp.get().getGender(),
					emp.get().getPassword());
	}

}
