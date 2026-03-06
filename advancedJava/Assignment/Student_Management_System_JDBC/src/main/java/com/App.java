package com;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Scanner;

import com.dao.MySQLStudentDAO;
import com.dao.interfaces.StudentDAO;
import com.exception.InvalidStudentDataException;
import com.model.Student;

public class App {
    public static void main( String[] args ) throws SQLException {
        System.out.println("Welcome to Student Management System\n");
        
        StudentDAO dao = new MySQLStudentDAO();
        
        try (Scanner scanner = new Scanner(System.in)) {
	        while (true) {
	        	System.out.println("Select any option from the menu:");
	        	System.out.println("1. Add a new Student");
	        	System.out.println("2. View all students");
	        	System.out.println("3. Update student email by using mobile number");
	        	System.out.println("4. Delete a student by using id");
	        	System.out.println("5. Exit the program");
	        	
	        	System.out.print("Enter your choice: ");
	        	int choice = Integer.parseInt(scanner.nextLine());
	        	
	        	try {
	        		switch (choice) {
					case 1: {
							System.out.println("Enter the student details ");
							Student student = new Student();
							
							System.out.print("Enter name: ");
							String name = scanner.nextLine();
							student.setName(name);
							
							System.out.print("Enter email: ");
							String email = scanner.nextLine();
							student.setEmail(email);
						
							System.out.print("Enter age: ");
							int age = Integer.parseInt(scanner.nextLine());
							student.setAge(age);
							
							System.out.print("Enter mobile number: ");
							long mobileNumber = Long.parseLong(scanner.nextLine());
							student.setMobileNumber(mobileNumber);
							
							dao.insertNewStudent(student);
						}
						break;
					case 2: {
							System.out.println("The details of all the students are: ");
							
							List<Student> students = dao.getAllStudents();
							students.forEach(System.out::println);
							System.out.println("\n");
						}
						break;
					case 3: {
							System.out.print("Enter mobile number: ");
							long mobileNumber = Long.parseLong(scanner.nextLine());
							
							System.out.print("Enter the new email id: ");
							String email = scanner.nextLine();
							
							dao.updateStudentEmailUsingMobileNumber(mobileNumber, email);
						}
						break;
					case 4: {
							System.out.print("Enter the student id: ");
							int id = Integer.parseInt(scanner.nextLine());
							
							dao.deleteStudentById(id);
						}
						break;
					case 5: {
							System.out.println("\nThank you for using Student Management System!!");
							return;
						}
					default:
						System.out.println("Incorrect Choice!!");
						break;
					}
	        	} catch (InvalidStudentDataException e) {
	        		System.out.println("\nError: " + e.getMessage() + "\n");
	        	} catch (SQLIntegrityConstraintViolationException e) {
	        		System.out.println("\nDB error: " + e.getMessage() + "\n");
	        	}
	        }
        }
    }
}
