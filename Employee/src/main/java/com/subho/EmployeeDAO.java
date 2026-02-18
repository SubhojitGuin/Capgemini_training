package com.subho;

import java.sql.*;

public class EmployeeDAO {

//    private static Connection connection = null;

    public Connection connectToDb() {
        String connectionURL = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "root";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, username, password);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Database connection failed");
            System.out.println("Quitting the program...");
            System.exit(0);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public Employee readEmployeeDetails() {
        System.out.print("Enter the name of the employee: ");
        String name = EmployeeDemo.scanner.nextLine();

        System.out.print("Enter the designation of the employee: ");
        String designation = EmployeeDemo.scanner.nextLine();

        System.out.print("Enter the salary of the employee: ");
        float salary = Float.parseFloat(EmployeeDemo.scanner.nextLine());

        System.out.print("Enter the yearsOfExperience of the employee: ");
        int yearsOfExperience = Integer.parseInt(EmployeeDemo.scanner.nextLine());

        return new Employee(name, designation, salary, yearsOfExperience);
    }

    // statement
    // prepared statement
    // callable statement
    public void createEmployee() {
        Employee employee = readEmployeeDetails();
        String query = "INSERT INTO employees (name, designation, salary, years_of_experience) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = connectToDb();
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDesignation());
            ps.setFloat(3, employee.getSalary());
            ps.setInt(4, employee.getYearsOfExperience());

            boolean rowsInserted = ps.execute();
            connection.commit();

            if (rowsInserted) {
                System.out.println("Row inserted successfully!");
            } else {
                System.out.println("Row insertion failed.");
            }

            ps.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Row insertion failed");
        }
    }

    public void searchEmployeeById(int id) {
        String query = "SELECT * FROM employees WHERE id=?";

        try {
            Connection connection = connectToDb();
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("designation"), rs.getFloat("salary"), rs.getInt("yearsOfExperience"));
                System.out.println(employee);
            }

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployee(int id, float salary) {
        String query = "UPDATE employees SET salary=? WHERE id=?";

        try {
            Connection connection = connectToDb();
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setFloat(1, salary);
            ps.setInt(2, id);

            int rowsUpdated = ps.executeUpdate();
            connection.commit();

            if (rowsUpdated > 0) {
                System.out.println("Row updated successfully!");
            } else {
                System.out.println("Row update failed.");
            }

            ps.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Row update failed");
        }
    }

    public void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id=?";

        try {
            Connection connection = connectToDb();
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, id);

            int rowsDeleted = ps.executeUpdate();
            connection.commit();

            if (rowsDeleted > 0) {
                System.out.println("Row deleted successfully!");
            } else {
                System.out.println("Row deletion failed.");
            }

            ps.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Row deletion failed");
        }
    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS employees (id INT AUTO_INCREMENT PRIMARY KEY , name VARCHAR(255) NOT NULL, designation VARCHAR(255) NOT NULL, salary FLOAT DEFAULT 0, years_of_experience INT DEFAULT 0)";

            try {
                Connection connection = connectToDb();
                Statement statement = connection.createStatement();

                statement.execute(query);
                connection.commit();

                System.out.println("Table created successfully!");

                statement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Table creation may have failed");
            }
    }

    public void listAllEmployees() {
        String query = "SELECT * FROM employees";

        try {
            Connection connection = connectToDb();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("designation"), rs.getFloat("salary"), rs.getInt("yearsOfExperience"));
                System.out.println(employee);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
