package com.customer.entity;

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
@Table(name = "customer_details")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(name = "customer_name", nullable = false)
	private String name;
	
	@Column(name = "customer_email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "customer_mobile_number", nullable = false, unique = true)
	private Long mobileNumber;
	
	@Column(name = "cutomer_password", nullable = false, unique = true)
	private String password;

}
