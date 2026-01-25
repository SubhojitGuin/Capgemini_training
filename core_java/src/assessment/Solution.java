package assessment;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Fulltime Employee");
		FullTime fullTime = new FullTime(12, "Dinga", "dev", 1000.0);
		try {
			fullTime.setSalary("HR", 10000.0);
		} catch (InvalidSalaryException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (UnauthorizedAccessException e) {
			System.out.println("Error: " + e.getMessage());
		}
		fullTime.totalPay();
		
		
		System.out.println("\nContract Employee");
		Contract contract = new Contract(13, "Dingi", "qa", 100, 5);
		try {
			contract.setSalary("dev", 500.0);
		} catch (InvalidSalaryException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (UnauthorizedAccessException e) {
			System.out.println("Error: " + e.getMessage());
		}
		contract.totalPay();
	}
}

abstract class Employee {
	private int employeeId;
	private String name;
	private String role;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String name, String role, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(String role, double salary) throws InvalidSalaryException {
		if (!"HR".equals(role)) {
			throw new UnauthorizedAccessException("Access denied");
		}
		
		if (salary < 0) {
			throw new InvalidSalaryException("Invalid salary");
		}
		
		this.salary = salary;
	}
	
}

interface Payroll {
	public void totalPay();
}

//Child classes
class FullTime extends Employee implements Payroll {
	
	public FullTime(int employeeId, String name, String role, double salary) {
		super(employeeId, name, role, salary);
	}

	@Override
	public void totalPay() {
		System.out.println("Total Pay: " + this.getSalary() * 12);
	}
	
}

class Contract extends Employee implements Payroll {
	
	private int totalHours;
	
	public Contract(int employeeId, String name, String role, double salary, int totalHours) {
		super(employeeId, name, role, salary);
		this.totalHours = totalHours;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}

	@Override
	public void totalPay() {
		System.out.println("Total Pay: " + (this.getSalary() * this.totalHours));
	}
	
}

// Exceptions
class UnauthorizedAccessException extends RuntimeException { //unchecked
	
	public UnauthorizedAccessException(String message) {
		super(message);
	}	
	
}

class InvalidSalaryException extends Exception { //checked
	
	public InvalidSalaryException(String message) {
		super(message);
	}
	
}