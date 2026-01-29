package collectionFramework.listInterface;

import java.util.*;

public class Employee {
	
	int id;
	String name;
	double salary;
	String department;
	
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public static List<Employee> findEmployeeByDepartment(List<Employee> employeeList, String department) {
		List<Employee> deptEmployees = new ArrayList<Employee>();
		
		for (Employee emp: employeeList) {
			if (emp.department.equals(department)) {
				deptEmployees.add(emp);
			}
		}
		
		return deptEmployees;
	}
	
	public static List<Employee> findEmployeeBySalary(List<Employee> employeeList, double salary) {
		List<Employee> salaryEmployees = new ArrayList<Employee>();
		
		for (Employee emp: employeeList) {
			if (emp.salary >= salary) {
				salaryEmployees.add(emp);
			}
		}
		
		return salaryEmployees;
	}
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, "Dinga", 550000, "development"));
		employeeList.add(new Employee(2, "Dingi", 150000, "sales"));
		employeeList.add(new Employee(3, "Dingu", 100000, "hr"));
		employeeList.add(new Employee(4, "Dingo", 850000, "development"));
		
		System.out.println("Salary");
		List<Employee> salaryEmployees = findEmployeeBySalary(employeeList, 500000);
		for (Employee emp: salaryEmployees) {
			System.out.println(emp);
			System.out.println("---------");
		}
		
		System.out.println("Department");
		List<Employee> deptEmployees = findEmployeeByDepartment(employeeList, "development");
		for (Employee emp: deptEmployees) {
			System.out.println(emp);
			System.out.println("---------");
		}
	}

}
