package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/* Write a program to take the details of the Student and insert the details of the Student in the Student DB */
public class InsertStudentDetailsJDBC {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Student Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the Student Percentage: ");
			double percentage = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter the Student Stream: ");
			String stream = sc.nextLine();
			
			System.out.print("Enter the Student Degree: ");
			String degree = sc.nextLine();

			System.out.print("Enter the Student Email ID: ");
			String email = sc.nextLine();
			
			System.out.print("Enter the Student Gender: ");
			String gender = sc.nextLine();
			
			System.out.print("Enter the Student Date of Birth: ");
			String dob = sc.nextLine();
			
			System.out.print("Enter the Student Mobile Number: ");
			long mobileNo = Long.parseLong(sc.nextLine());
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Class Loaded Successfully.....");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String insertQuery = "INSERT INTO student_management_system.student_details (Student_Name, Student_Percentage, Student_Stream, Student_Degree, Student_EmailId, Student_Gender, Student_Date_Of_Birth, Student_Mobile_Number) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			try {
				Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				System.out.println("Connection created successfully");
				
				PreparedStatement ps = conn.prepareStatement(insertQuery);
				ps.setString(1, name);
				ps.setDouble(2, percentage);
				ps.setString(3, stream);
				ps.setString(4, degree);
				ps.setString(5, email);
				ps.setString(6, gender);
				ps.setDate(7, Date.valueOf(dob));
				ps.setLong(8, mobileNo);
				System.out.println("Platform Created");
				
				int rowsAffected = ps.executeUpdate();
				
				if (rowsAffected > 0) {
					System.out.println("Data inserted successfully");
				} else {
					System.out.println("No data inserted");
				}
				
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
