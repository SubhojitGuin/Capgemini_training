package com.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.EmployeeDetailsEntity;

import jakarta.websocket.server.PathParam;

public interface EmployeeRepository extends JpaRepository<EmployeeDetailsEntity, Integer> {
	
	Long countByEmailIgnoreCaseOrMobileNumber(String email, Long mobileNumber);
	
	Optional<EmployeeDetailsEntity> findByEmailAndPassword(String email, String password);
	
	@Modifying
	Long removeByEmail(String email);

	@Modifying
	@Query("""
			UPDATE EmployeeDetailsEntity emp
			SET emp.employeeSalary = :salary
			WHERE emp.mobileNumber = :mobileNumber
		""")
	Long updateSalaryByMobileNumber(@PathParam("salary") Double salary, 
									@PathParam("mobileNumber") Long mobileNumber);

}
