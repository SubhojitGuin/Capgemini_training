package com.employeeJDBC;

public class ECommerceDriver {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Commerce Application!");

        while (true) {
            System.out.println("\n\nPlease select an option:");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Insert Order");
            System.out.println("4. Insert Cart");
            System.out.println("5. Delete Cart");
            System.out.println("6. Update Customer Email");
            System.out.println("7. Exit");

            int choice = Integer.parseInt(Resources.getScannerObject().nextLine());

            switch (choice) {
                case 1:
                    CustomerJDBC.insert();
                    break;
                case 2:
                    ProductJDBC.insert();
                    break;
                case 3:
                    OrderJDBC.insert();
                    break;
                case 4:
                    CartJDBC.insert();
                    break;
                case 5:
                    CartJDBC.delete();
                    break;
                case 6:
                    CustomerJDBC.updateEmailUsingPhoneNumber();
                    break;
                case 7:
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
