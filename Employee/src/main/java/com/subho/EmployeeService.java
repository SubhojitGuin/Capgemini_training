package com.subho;

public class EmployeeService {

    private EmployeeDAO dao;

    {
        dao = new EmployeeDAO();
    }

    public void addEmployee() {
        dao.createEmployee();
    }

    public void searchEmployee() {
        System.out.print("Enter the id of the employee to be searched: ");
        int id = Integer.parseInt(EmployeeDemo.scanner.nextLine());
        dao.searchEmployeeById(id);
    }

    public void deleteEmployee() {
        System.out.print("Enter the id of the employee to be deleted: ");
        int id = Integer.parseInt(EmployeeDemo.scanner.nextLine());
        dao.deleteEmployee(id);
    }

    public void updateEmployee() {
        System.out.print("Enter the id of the employee to be updated: ");
        int id = Integer.parseInt(EmployeeDemo.scanner.nextLine());
        System.out.print("Enter the new salary of the employee: ");
        float newSalary = Float.parseFloat(EmployeeDemo.scanner.nextLine());
        dao.updateEmployee(id, newSalary);
    }

    public void listAllEmployees() {
        dao.listAllEmployees();
    }

    public void createTable() {
        dao.createTable();
    }

}
