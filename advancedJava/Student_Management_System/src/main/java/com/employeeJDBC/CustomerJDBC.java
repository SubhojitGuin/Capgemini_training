package com.employeeJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerJDBC {

    private static final String INSERT_CUSTOMER_QUERY = "INSERT INTO customer_details (Customer_Name, Customer_EmailId, Customer_Mobile_Number, Customer_Gender, Customer_Address, Password)"
            + "VALUES (?, ?, ?, ?, ?, ?)";

    private static final String UPDATE_EMAIL_QUERY = "UPDATE customer_details SET Customer_EmailId = ? WHERE Customer_Mobile_Number = ?";


    public static void insert() {
        Scanner sc = Resources.getScannerObject();

        System.out.print("Enter the Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Customer Email Id: ");
        String emailId = sc.nextLine();

        System.out.print("Enter the Customer Mobile Number: ");
        Long mobileNumber = Long.parseLong(sc.nextLine());

        System.out.print("Enter the Customer Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter the Customer Address: ");
        String address = sc.nextLine();

        System.out.print("Enter the Customer Password: ");
        String password = sc.nextLine();

        insertIntoDB(name, emailId, mobileNumber, gender, address, password);
    }

    private static void insertIntoDB(String name, String emailId, Long mobileNumber, String gender, String address, String password) {
        try {
            Connection conn = Resources.getDBConnection();

            PreparedStatement ps = conn.prepareStatement(INSERT_CUSTOMER_QUERY);
            ps.setString(1, name);
            ps.setString(2, emailId);
            ps.setLong(3, mobileNumber);
            ps.setString(4, gender);
            ps.setString(5, address);
            ps.setString(6, password);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0)
                System.out.println("Customer inserted successfully");
            else
                System.out.println("Customer insertion failed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateEmailUsingPhoneNumber() {
        Scanner sc = Resources.getScannerObject();

        System.out.print("Enter the Customer Mobile Number: ");
        Long mobileNumber = Long.parseLong(sc.nextLine());

        System.out.print("Enter the new Email Id: ");
        String newEmailId = sc.nextLine();

        updateEmailInDB(mobileNumber, newEmailId);
    }

    private static void updateEmailInDB(Long mobileNumber, String newEmailId) {

        try {
            Connection conn = Resources.getDBConnection();

            PreparedStatement ps = conn.prepareStatement(UPDATE_EMAIL_QUERY);
            ps.setString(1, newEmailId);
            ps.setLong(2, mobileNumber);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0)
                System.out.println("Email updated successfully");
            else
                System.out.println("Email update failed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}