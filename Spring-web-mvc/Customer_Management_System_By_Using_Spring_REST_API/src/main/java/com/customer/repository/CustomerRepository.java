package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerEntity;
import java.util.Optional;



@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
	
	Optional<CustomerEntity> findByEmailOrMobileNumberOrPassword(String email, Long mobileNumber, String password);
	
	Optional<CustomerEntity> findByMobileNumber(Long mobileNumber);
	
	@Modifying
	@Query("""
			UPDATE CustomerEntity ce
			SET ce.password = :password
			WHERE ce.email = :email
			""")
	Long updatePasswordByEmail(
			@Param("email") String email, 
			@Param("password") String password
	);
	
	@Modifying
	Long removeById(int id);

}
