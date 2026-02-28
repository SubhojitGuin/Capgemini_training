package com.employeeJDBC;

import java.util.Scanner;

public class OrderJDBC {

    private static String INSERT_ORDER_QUERY = "INSERT INTO order_details (Customer_ID, Product_ID, Price, Address) VALUES (?, ?, ?, ?)";

     public static void insert() {
         Scanner sc = Resources.getScannerObject();

         System.out.print("Enter the Customer ID: ");
         int customerId = Integer.parseInt(sc.nextLine());

         System.out.print("Enter the Product ID: ");
         int productId = Integer.parseInt(sc.nextLine());

         System.out.print("Enter the Price: ");
         double price = Double.parseDouble(sc.nextLine());

         System.out.print("Enter the Address: ");
         String address = sc.nextLine();

         insertIntoDB(customerId, productId, price, address);
     }

    private static void insertIntoDB(int customerId, int productId, double price, String address) {
        try {
            java.sql.Connection conn = Resources.getDBConnection();

            java.sql.PreparedStatement ps = conn.prepareStatement(INSERT_ORDER_QUERY);
            ps.setInt(1, customerId);
            ps.setInt(2, productId);
            ps.setDouble(3, price);
            ps.setString(4, address);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0)
                System.out.println("Order inserted successfully");
            else
                System.out.println("Order insertion failed");
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
