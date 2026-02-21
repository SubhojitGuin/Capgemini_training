package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHandling {

    public static void main(String[] args) {
        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(1, "Sam", 20000, 10, "sam@gmail.com", "male"));
        list.add(new EmployeeDetails(2, "John", 30000, 2, "john@gmail.com", "male"));
        list.add(new EmployeeDetails(3, "Alice", 55000, 10, "alice@gmail.com", "female"));
        list.add(new EmployeeDetails(4, "Bob", 3000, 2, "bob@gmail.com", "male"));
        list.add(new EmployeeDetails(5, "Carol", 28000, 3, "carol@gmail.com", "female"));

        /* File - used to create and delete the file */
//        File file = new File("files/Employee.txt"); // Create and delete file
//
//        /* Create a new file */
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File is created!!");
//            } else {
//                System.out.println("File already exists!!");
//            }
//        } catch(IOException e) {
//            System.err.println("Issue in file creation");
//            System.out.println(e);
//        }

        long countOfMale = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).count();

        /* File Writer - It is used to create the file and write the output in the file
        * To create the file in the particular path we need to provide the path as an argument to teh FileWriter constructor
        * */
//        try {
//            FileWriter fw = new FileWriter("Employee.txt");
//            fw.write("Male employee count: " + countOfMale); // writer is the method which is used to write the data on the file
//            fw.close(); // used to commit the data and close the connection b/w the Java file and the text file
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        /* Max method is used to compare two objects to get the max value as a result
        * -> The return type of the max() is Optional class
        * -> Optional is the class which is used to store any type of data or object
        * -> It was introduced in Java 8
        * -> To get the object from the Optional class we need to make use of get() method
        */
//        list.stream().max(Comparator.comparingDouble(EmployeeDetails::getSalary)).get();
//        EmployeeDetails maxSalaryEmployee = list.stream()
//                .max((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
//                .get();
//
//        try {
//            FileWriter writer = new FileWriter("MaxEmployeeSalary.txt");
//            writer.write("" + maxSalaryEmployee);
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        /* WAP to store the details of the employees after incrementing the salary of employee by 3 percent */
        try {
            FileWriter writer = new FileWriter("EmployeeWithIncrement.txt");
            list.stream().peek(emp -> emp.setSalary(emp.getSalary() * 1.03)).forEach(emp -> {
                try {
                    writer.write( emp + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* WAP to store the details of the departments by removing the duplicates of the department no */
        try {
            FileWriter fw = new FileWriter("DistinctEmployeeDepartments.txt");
            List<Integer> uniqueDeptNo = list.stream().map(emp -> emp.getDeptNo()).distinct().toList();
            fw.write(uniqueDeptNo + "");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* WAP to store the details of the employees if employee salary is minimum */
        try {
            FileWriter fw = new FileWriter("MinEmployeeDetails.txt");
            EmployeeDetails minEmployee = list.stream().min(Comparator.comparingDouble(EmployeeDetails::getSalary)).get();
            fw.write(minEmployee + "");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* Buffered Writer -  */
//        try {
//            FileWriter fw = new FileWriter("Employee.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Male employeesss count: " + countOfMale); // writer is the method which is used to write the data on the file
//            bw.close();
//            fw.close(); // used to commit the data and close the connection b/w the Java file and the text file
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
