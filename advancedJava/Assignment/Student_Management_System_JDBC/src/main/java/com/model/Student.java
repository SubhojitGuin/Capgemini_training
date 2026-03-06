package com.model;

import com.exception.InvalidStudentDataException;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private int age;
	private long mobileNumber;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String email, int age, long mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}
	
	public Student(String name, String email, int age, long mobileNumber) {
		super();
		this.id = 0;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNumber = mobileNumber;
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
	
	public void setName(String name) throws InvalidStudentDataException {
		if (name == null || name.length() == 0) {
			throw new InvalidStudentDataException("Student name cannot be empty");
		}
		
		if (name.matches("[\\d]+")) {
			throw new InvalidStudentDataException("Student name cannot be numeric");
		}
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws InvalidStudentDataException {
		if (!email.matches("[\\w]+@[A-Za-z][\\w]*\\.[A-Za-z]{1,3}")) {
			throw new InvalidStudentDataException("Student email is invalid");
		}
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws InvalidStudentDataException {
		if (age <= 0) {
			throw new InvalidStudentDataException("Student age is invalid");
		}
		this.age = age;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) throws InvalidStudentDataException {
		int length = String.valueOf(mobileNumber).length();
		
		if (length != 10) {
			throw new InvalidStudentDataException("Student mobile number is invalid");
		}
		
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
