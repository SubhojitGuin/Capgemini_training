package hashing;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int employeeId;
    private String employeeName;
    private String gender;
    private LocalDate dateOfBirth;
    private int experience;
    private String email;
    private long phoneNumber;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String gender, LocalDate dateOfBirth, int experience, String email, long phoneNumber) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {

        System.out.println("equals() method invoked");

        if (!(o instanceof Employee employee)) return false;
        return employeeId == employee.employeeId && experience == employee.experience && phoneNumber == employee.phoneNumber && Objects.equals(employeeName, employee.employeeName) && Objects.equals(gender, employee.gender) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {

        System.out.println("hashCode() method invoked");

        return Objects.hash(employeeId, employeeName, gender, dateOfBirth, experience, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", experience=" + experience +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        System.out.println("compareTo() method invoked");
//        return Integer.compare(this.employeeId, o.employeeId);
        return this.employeeId - o.employeeId;
    }
}
