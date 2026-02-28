package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* Write a JDBC program to display the details of the students if the salary is greater than 80 */
public class SearchStudentUsingSalaryJDBC {
	
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/student_management_system";
		String DB_USER = "root";
		String DB_PASSWORD = "root";
		
		String SELECT_QUERY = "SELECT * FROM student_details WHERE Student_Percentage > ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded Successfully.....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Connection created successfully");
			
			PreparedStatement ps = conn.prepareStatement(SELECT_QUERY);	
			ps.setInt(1, 80);
			
			ResultSet resultSet = ps.executeQuery();
			
			/* check whether the value exists in the Result Set (Buffer Memory) without moving the cursor
			 * This checks whether the cursor is before the first row of the data in ResultSet or not.
			 */
			if (resultSet.isBeforeFirst()) { 
				while (resultSet.next()) {				
					System.out.println("\n------------------------------------\n");
					System.out.println("Student ID:\t\t" + resultSet.getInt("Student_ID"));
					System.out.println("Student Name:\t\t" + resultSet.getString("Student_Name"));
					System.out.println("Student Percentage:\t" + resultSet.getDouble("Student_Percentage"));
					System.out.println("Student Stream:\t\t" + resultSet.getString("Student_Stream"));
					System.out.println("Student Degree:\t\t" + resultSet.getString("Student_Degree"));
					System.out.println("Student EmailId:\t\t" + resultSet.getString("Student_EmailId"));
					System.out.println("Student Gender:\t\t" + resultSet.getString("Student_Gender"));
					System.out.println("Student Date of Birth: " + resultSet.getDate("Student_Date_Of_Birth")); 
					System.out.println("Student Mobile Number: " + resultSet.getLong("Student_Mobile_Number")); 
				}
			} else {
				System.out.println("No data found!");
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
