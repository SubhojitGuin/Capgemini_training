package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_information")
public class UserInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generate values automatically
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "user_name", nullable = false)
	private String name;
	
	@Column(name = "user_email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "user_mobile_number", unique = true, length = 10, nullable = false)
	private long mobileNumber;
	
	@Column(name = "user_gender", nullable = false, length = 10)
	public String gender;

	public UserInformation() {
		super();
	}

	public UserInformation(int id, String name, String email, long mobileNumber, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + "]";
	}

}
