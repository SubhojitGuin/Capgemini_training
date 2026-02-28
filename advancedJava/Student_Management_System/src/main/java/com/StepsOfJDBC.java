package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StepsOfJDBC {
	private static final String DB_URL = "jdbc:mysql://localhost:3306";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the Employee ID: ");
//		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the Employee Name: ");
		String name = sc.nextLine();
		
//		System.out.print("Enter the Employee Email ID: ");
//		String email = sc.nextLine();
		
		System.out.print("Enter the Employee Salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the Employee Mobile Number: ");
		long mb = Long.parseLong(sc.nextLine());
		
		System.out.print("Enter the Employee Deptno: ");
		int deptno = Integer.parseInt(sc.nextLine());
		
//		System.out.print("Enter the Employee Gender: ");
//		String gender = sc.nextLine();
//		
//		System.out.print("Enter the Employee Address: ");
//		String address = sc.nextLine();
//		
//		System.out.print("Enter the Employee Designation: ");
//		String designation = sc.nextLine();
		
//		String insertQuery = "INSERT INTO iem.employee_details VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//		String insertQuery = "INSERT INTO iem.employee_details(emp_id, emp_name, emp_mobile_number, emp_deptno, emp_salary) VALUES (?, ?, ?, ?, ?)";
		String insertQuery = "INSERT INTO iem.employee_details(emp_name, emp_mobile_number, emp_deptno, emp_salary) VALUES (?, ?, ?, ?)";
		
		try {
			/* Load the Driver Class */
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded Successfully.....");
			
			/* Establish the connection */
			Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection Successfull.....");
			
			/* Creation of Platform */
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			System.out.println(preparedStatement);
			
//			preparedStatement.setInt(1, id);
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, mb);
			preparedStatement.setInt(3, deptno);
			preparedStatement.setDouble(4, salary);
			System.out.println(preparedStatement);
			System.out.println("Platform Created");
			
			int result = preparedStatement.executeUpdate();
			
			if (result > 0) {
				System.out.println("Data inserted successfully");
			} else {
				System.out.println("No Data inserted");
			}
			
//			connection.commit();
			
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}