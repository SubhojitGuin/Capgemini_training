package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_information")
public class CustomerInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int id;
	
	@Column(name = "customer_name", length = 100, nullable = false)
	private String name;
	
	@Column(name = "customer_mobile_number", nullable = false, unique = true)
	private long mobileNumber;
	
	@Column(name = "customer_address", nullable = false)
	private String address;
	
	@Column(name = "customer_email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "customer_gender", length = 10, nullable = false)
	private String gender;

	public CustomerInformation() {
		super();
	}

	public CustomerInformation(int id, String name, long mobileNumber, String address, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerInformation [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address="
				+ address + ", email=" + email + ", gender=" + gender + "]";
	}

}
