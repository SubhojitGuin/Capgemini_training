package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /* File class is used to create and delete the file
     *
     * File writer is used to create and write the data on the file
     *
     * BufferWriter is used to store the data in the buffer and write it in the file */
    public static void main(String[] args) throws InterruptedException {
        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(1, "Sam", 20000, 10, "sam@gmail.com", "male"));
        list.add(new EmployeeDetails(2, "John", 30000, 2, "john@gmail.com", "male"));
        list.add(new EmployeeDetails(3, "Alice", 55000, 10, "alice@gmail.com", "female"));
        list.add(new EmployeeDetails(4, "Bob", 3000, 2, "bob@gmail.com", "male"));
        list.add(new EmployeeDetails(5, "Carol", 28000, 3, "carol@gmail.com", "female"));
//        list.add(new EmployeeDetails(6, "David", 32000, 10, "david@gmail.com", "male"));
//        list.add(new EmployeeDetails(7, "Emma", 11000, 2, "emma@gmail.com", "female"));
//        list.add(new EmployeeDetails(8, "Frank", 21000, 3, "frank@gmail.com", "male"));
//        list.add(new EmployeeDetails(9, "Grace", 29000, 10, "grace@gmail.com", "female"));
//        list.add(new EmployeeDetails(10, "Jira", 50000, 3, "jira@gmail.com", "female"));

//        list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).forEach(System.out::println);
        /* Get the number of male employees */
//        long countOfMale = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).count();
//        System.out.println(countOfMale);

        /* Write a Stream program to display the details of the employees with salary < 10,000 */
//        list.stream().filter(emp -> emp.getSalary() < 10_000).forEach(System.out::println); // Method reference
//        list.stream().filter(emp -> emp.getSalary() < 10_000).forEach(emp -> {
//            System.out.println("Id: " + emp.getId());
//            System.out.println("Name: " + emp.getName());
//            System.out.println("Salary: " + emp.getSalary());
//            System.out.println("Department No.: " + emp.getDeptNo());
//            System.out.println("Email ID: " + emp.getEmailId());
//            System.out.println("Gender: " + emp.getGender());
//            System.out.println("\n-----------\n");
//        });

        list.stream().filter(emp -> emp.getDeptNo() == 10)
                .peek(emp -> emp.setSalary(emp.getSalary() * 1.1)).forEach(System.out::println);
        list.stream().filter(emp -> emp.getDeptNo() == 10)
                .peek(emp -> emp.setSalary(emp.getSalary() * 1.1)).forEach(System.out::println);


        List<EmployeeDetails> list1 = list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).stream().collect(Collectors.toList());
        System.out.println("Max" + list1);
        try {
            FileOutputStream o = new FileOutputStream("C:\\Users\\Subhojit Guin\\Projects\\Capgemini_training\\advancedJava\\Stream_API\\text.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file = new File("e.txt");

        try {
//            FileWriter f = new FileWriter("Empl.txt");
            FileWriter f = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(f);

            writer.write("" + list1);
            writer.newLine();
            writer.close();
        } catch (Exception e) {

        }

        List<EmployeeDetails> empList = list.stream().filter(emp -> emp.getDeptNo() == 10).toList();
        try {
            FileWriter f = new FileWriter("Employee.html");

            f.write("" + list1);
            f.close();
        } catch (Exception e) {

        }
        String a = "Subhojit";
        for (int i = 0; i < a.length(); i++) {
            Thread.sleep(200);

            System.out.print(a.charAt(i));
        }
        System.out.println();
        try {
            FileOutputStream f = new FileOutputStream("emp1.html");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(list1);
            PrintWriter w = new PrintWriter(o);
            w.write("" + list1);
            w.close();

//            PrintWriter pw = new PrintWriter(f);
//            for (EmployeeDetails emp: empList) {
//                pw.println(emp);
//            }
            //        pw.close();
            f.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
