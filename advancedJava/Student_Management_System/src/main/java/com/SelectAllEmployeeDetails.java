package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllEmployeeDetails {

	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/iem";
		String DB_USER = "root";
		String DB_PASSWORD = "root";
		
		String SELECT_QUERY = "SELECT * FROM employee_details";
//		String SELECT_QUERY = "SELECT * FROM employee_details WHERE emp_deptno = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded Successfully.....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Connection created successfully");
			
			PreparedStatement ps = conn.prepareStatement(SELECT_QUERY);
			
//			ps.setInt(1, 11);
			
			ResultSet resultSet = ps.executeQuery();
			
//			if (resultSet.next()) {
//				System.out.println("Data exists");
//			} else {
//				System.out.println("Data does not exist");
//			}
			
			while (resultSet.next()) { // executed n times where n = number of rows
				System.out.println("\n------------------------------------\n");
				System.out.println("Employee ID:\t\t" + resultSet.getInt("emp_id"));
				System.out.println("Employee Name:\t\t" + resultSet.getString("emp_name"));
				System.out.println("Employee Mobile Number: " + resultSet.getLong("emp_mobile_number")); 
				System.out.println("Employee DeptNo:\t\t" + resultSet.getInt("emp_deptno"));
				System.out.println("Employee Salary:\t\t" + resultSet.getDouble("emp_salary"));
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
