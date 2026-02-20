package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeDetails {
    private int id;
    private String name;
    private double salary;
    private int deptNo;
    private String emailId;
    private String gender;

    public EmployeeDetails() {
        super();
    }

    public EmployeeDetails(int id, String name, double salary, int deptNo, String emailId, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptNo = deptNo;
        this.emailId = emailId;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptNo=" + deptNo +
                ", emailId='" + emailId + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class EmployeeDetailsDriver {

    public static void displayAllEmployees(List<EmployeeDetails> employeeDetailsList) {
//        employeeDetailsList.stream()
//                .forEach(System.out::println);
        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);
        for (EmployeeDetails emp: employeeDetailsList)
            printEmployee.accept(emp);
    }

    public static void displayAllEmployeesWithSalaryMoreThan(List<EmployeeDetails> employeeDetailsList, double salary) {
//        employeeDetailsList.stream()
//                .filter(emp -> emp.getSalary() > salary)
//                .forEach(System.out::println);

        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);
        Predicate<EmployeeDetails> filterBySalary = emp -> emp.getSalary() > salary;
        for (EmployeeDetails emp: employeeDetailsList) {
            if (filterBySalary.test(emp))
                printEmployee.accept(emp);
        }
    }

    public static void countMaleAndFemaleEmployees(List<EmployeeDetails> employeeDetailsList) {
//        long maleCount = employeeDetailsList.stream()
//                .filter(emp -> emp.getGender().equals("male")).count();

        Predicate<EmployeeDetails> isMale = emp -> emp.getGender().equals("male");
        int maleCount = 0;
        for (EmployeeDetails emp: employeeDetailsList) {
            if (isMale.test(emp))
                maleCount++;
        }

        System.out.println("Male count: " + maleCount);
        System.out.println("Female count: " + (employeeDetailsList.size() - maleCount));
    }

    public static void displayAllEmployeesSortedBySalary(List<EmployeeDetails> employeeDetailsList) {
//        employeeDetailsList.stream()
//                .sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
//                .forEach(System.out::println);

        employeeDetailsList.sort((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()));
        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);
        for (EmployeeDetails emp: employeeDetailsList)
            printEmployee.accept(emp);
    }

    public static void displayAllEmployeesWithDeptNoAndIncreaseSalary(List<EmployeeDetails> employeeDetailsList, int deptNo) {
//        employeeDetailsList.stream()
//                .filter(emp -> emp.getDeptNo() == deptNo)
//                .peek(emp -> emp.setSalary(emp.getSalary() * 1.1))
//                .forEach(System.out::println);

        Predicate<EmployeeDetails> filterByDeptNo = emp -> emp.getDeptNo() == deptNo;
        Consumer<EmployeeDetails> modifySalary = emp -> emp.setSalary(emp.getSalary() * 1.1);
        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);

        for (EmployeeDetails emp: employeeDetailsList) {
            if (filterByDeptNo.test(emp)) {
                modifySalary.accept(emp);
                printEmployee.accept(emp);
            }
        }
    }

    public static void displayEmployeeWithMaxSalary(List<EmployeeDetails> employeeDetailsList) {
//        System.out.println(employeeDetailsList.stream()
//                .max((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
//                .get());

        EmployeeDetails[] maxEmp = new EmployeeDetails[1];
        Predicate<EmployeeDetails> isSalaryGreater = emp -> maxEmp[0] == null || emp.getSalary() > maxEmp[0].getSalary();
        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);

        for (EmployeeDetails emp: employeeDetailsList) {
            if (isSalaryGreater.test(emp))
                maxEmp[0] = emp;
        }

        printEmployee.accept(maxEmp[0]);
    }

    public static void displayEmployeeWithMinSalary(List<EmployeeDetails> employeeDetailsList) {
//        System.out.println(employeeDetailsList.stream()
//                .min((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
//                .get());

        EmployeeDetails[] maxEmp = new EmployeeDetails[1];
        Predicate<EmployeeDetails> isSalarySmaller = emp -> maxEmp[0] == null || emp.getSalary() < maxEmp[0].getSalary();
        Consumer<EmployeeDetails> printEmployee = emp -> System.out.println(emp);

        for (EmployeeDetails emp: employeeDetailsList) {
            if (isSalarySmaller.test(emp))
                maxEmp[0] = emp;
        }

        printEmployee.accept(maxEmp[0]);
    }

    public static void main(String[] args) {
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>(List.of(
                new EmployeeDetails(1, "Sam", 20000, 10, "sam@gmail.com", "male"),
                new EmployeeDetails(2, "John", 30000, 2, "john@gmail.com", "male"),
                new EmployeeDetails(3, "Alice", 5000, 10, "alice@gmail.com", "female"),
                new EmployeeDetails(4, "Bob", 3000, 2, "bob@gmail.com", "male"),
                new EmployeeDetails(5, "Carol", 28000, 3, "carol@gmail.com", "female"),
                new EmployeeDetails(6, "David", 32000, 10, "david@gmail.com", "male"),
                new EmployeeDetails(7, "Emma", 11000, 2, "emma@gmail.com", "female"),
                new EmployeeDetails(8, "Frank", 21000, 3, "frank@gmail.com", "male"),
                new EmployeeDetails(9, "Grace", 29000, 10, "grace@gmail.com", "female"),
                new EmployeeDetails(10, "Jira", 50000, 3, "jira@gmail.com", "female")
        ));

        System.out.println("\nDisplay All employees");
        displayAllEmployees(employeeDetailsList);

        System.out.println("\nDisplay employees with salary > 15000");
        displayAllEmployeesWithSalaryMoreThan(employeeDetailsList, 15000);

        System.out.println("\nMale and female employee count");
        countMaleAndFemaleEmployees(employeeDetailsList);

        System.out.println("\nDisplay employees sorted by salary");
        displayAllEmployeesSortedBySalary(employeeDetailsList);

        System.out.println("\nDisplay employees with Dept no 10 and inc salary by 10%");
        displayAllEmployeesWithDeptNoAndIncreaseSalary(employeeDetailsList, 10);

        System.out.println("\nDisplay employee with max salary");
        displayEmployeeWithMaxSalary(employeeDetailsList);

        System.out.println("\nDisplay employee with min salary");
        displayEmployeeWithMinSalary(employeeDetailsList);
    }

}