package revision;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String email;
    private int experience;
    private LocalDate dateOfBirth;
    private LocalTime timeOfBirth;
    private long phoneNumber;

    public Employee() {
    }

    public Employee(int id, String name, String email, int experience, LocalDate dateOfBirth, LocalTime timeOfBirth, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.dateOfBirth = dateOfBirth;
        this.timeOfBirth = timeOfBirth;
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    public void setTimeOfBirth(LocalTime timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && experience == employee.experience && phoneNumber == employee.phoneNumber && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(timeOfBirth, employee.timeOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, experience, dateOfBirth, timeOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                ", dateOfBirth=" + dateOfBirth +
                ", timeOfBirth=" + timeOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
