package com.employeeJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductJDBC {
	
	private static final String INSERT_PRODUCT_QUERY = "INSERT INTO product_details (Product_Name, Product_Price, Product_Discount, Brand, Category, Quantity)"
			+ "VALUES (?, ?, ?, ?, ?, ?);";
	
	public static void insert() {
		Scanner sc = Resources.getScannerObject();
		
		System.out.print("Enter the Product Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Product Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the Product Discount: ");
		double discount = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the Product Brand: ");
		String brand = sc.nextLine();
		
		System.out.print("Enter the Product Category: ");
		String category = sc.nextLine();
		
		System.out.print("Enter the Product Quantity: ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		insertIntoDB(name, price, discount, brand, category, quantity);
	}

	private static void insertIntoDB(String name, double price, double discount, String brand, String category, int quantity) {
		try {
			Connection conn = Resources.getDBConnection();
			
			PreparedStatement ps = conn.prepareStatement(INSERT_PRODUCT_QUERY);
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setDouble(3, discount);
			ps.setString(4, brand);
			ps.setString(5, category);
			ps.setInt(6, quantity);
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0)
				System.out.println("Product inserted successfully");
			else 
				System.out.println("Product insertion failed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
