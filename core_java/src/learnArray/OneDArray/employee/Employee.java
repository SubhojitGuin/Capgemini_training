package learnArray.OneDArray.employee;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private int yearsOfExperience;
	private String department;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary, int yearsOfExperience, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
		this.department = department;
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
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void print() {
		System.out.println();
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Years Of Experience: " + yearsOfExperience);
		System.out.println("Department: " + department);
	}
	
}
