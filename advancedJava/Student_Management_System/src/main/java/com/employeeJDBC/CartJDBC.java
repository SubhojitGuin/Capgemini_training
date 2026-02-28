package com.employeeJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CartJDBC {

    private static final String INSERT_CART_QUERY = "INSERT INTO cart_details (Customer_ID, Product_ID) VALUES (?, ?)";
    private static final String DELETE_CART_QUERY = "DELETE FROM cart_details WHERE Cart_ID = ? AND Product_ID = ?";

    public static void insert() {
        Scanner sc = Resources.getScannerObject();

        System.out.print("Enter the Customer ID: ");
        int customerId = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the Product ID: ");
        int productId = Integer.parseInt(sc.nextLine());

        insertIntoDB(customerId, productId);
    }

    private static void insertIntoDB(int customerId, int productId) {
        try {
            Connection conn = Resources.getDBConnection();

            PreparedStatement ps = conn.prepareStatement(INSERT_CART_QUERY);
            ps.setInt(1, customerId);
            ps.setInt(2, productId);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0)
                System.out.println("Cart inserted successfully");
            else
                System.out.println("Cart insertion failed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete() {
        Scanner sc = Resources.getScannerObject();

        System.out.print("Enter the Cart ID to delete: ");
        int cartId = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the Product ID to delete: ");
        int productId = Integer.parseInt(sc.nextLine());

        deleteFromDB(cartId, productId);
    }

    private static void deleteFromDB(int cartId, int productId) {

        try {
            Connection conn = Resources.getDBConnection();

            PreparedStatement ps = conn.prepareStatement(DELETE_CART_QUERY);
            ps.setInt(1, cartId);
            ps.setInt(2, productId);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0)
                System.out.println("Cart deleted successfully");
            else
                System.out.println("Cart deletion failed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
