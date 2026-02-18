package com.subho;

public class Employee {
    private int id;
    private String name;
    private String designation;
    private float salary;
    private int yearsOfExperience;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String designation, float salary, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

        public Employee(String name, String designation, float salary, int yearsOfExperience) {
        this.id = 0;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
