package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(1, "Sam", 20000, 10, "sam@gmail.com", "male"));
        list.add(new EmployeeDetails(2, "John", 30000, 2, "john@gmail.com", "male"));
        list.add(new EmployeeDetails(3, "Alice", 5000, 10, "alice@gmail.com", "female"));
        list.add(new EmployeeDetails(4, "Bob", 3000, 2, "bob@gmail.com", "male"));
        list.add(new EmployeeDetails(5, "Carol", 28000, 3, "carol@gmail.com", "female"));
//        list.add(new EmployeeDetails(6, "David", 32000, 10, "david@gmail.com", "male"));
//        list.add(new EmployeeDetails(7, "Emma", 11000, 2, "emma@gmail.com", "female"));
//        list.add(new EmployeeDetails(8, "Frank", 21000, 3, "frank@gmail.com", "male"));
//        list.add(new EmployeeDetails(9, "Grace", 29000, 10, "grace@gmail.com", "female"));
//        list.add(new EmployeeDetails(10, "Jira", 50000, 3, "jira@gmail.com", "female"));

//        list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).forEach(System.out::println);
        long countOfMale = list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male")).count();
        System.out.println(countOfMale);

        /* Write a Stream program to display the details of the employees */
    }

}
