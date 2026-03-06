package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLResourceSingleton {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/student_management_system";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Class Loaded Successfully.....");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
			
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Connection created successfully");
		}
		
		return conn;
	}

}
