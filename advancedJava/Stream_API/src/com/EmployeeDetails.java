package com;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {
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
