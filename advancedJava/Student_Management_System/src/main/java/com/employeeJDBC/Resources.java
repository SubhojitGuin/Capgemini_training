package com.employeeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Resources {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ecommerce_db";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	public static Connection conn;
	public static Scanner sc;
	
	public static Connection getDBConnection() throws SQLException {
		
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Class Loaded Successfully.....");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Connection created successfully");
		}
		
		return conn;
	}
	
	public static Scanner getScannerObject() {
		
		if (sc == null) {
			sc = new Scanner(System.in);
		}
		
		return sc;
	}

}
