package learnArray.OneDArray.employee;

import java.util.Scanner;

public class EmployeeServiceDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		Employee[] employees = new Employee[n];
		
		System.out.println("Enter the employee details: ");
		for (int i = 0; i < n; i++) {
			System.out.println();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			System.out.print("Years of Experience: ");
			int yearsOfExperience = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Department: ");
			String department = sc.nextLine();
			
			employees[i] = new Employee(id, name, salary, yearsOfExperience, department);
		}
		
		EmployeeService employeeService = new EmployeeServiceImp();
		
		System.out.println("\n--------------------------------------------------------\n");
		System.out.print("Enter the minimum salary: ");
		double minSalary = sc.nextDouble();
		
		Employee[] highSalaryEmployees = employeeService.getHighSalaryEmployees(employees, minSalary);
		System.out.println("The high salary employees are: ");
		for (Employee employee: highSalaryEmployees) {
			employee.print();
		}
		
		System.out.println("\n--------------------------------------------------------\n");
		System.out.println("The average salary is: " + employeeService.calculateAverageSalary(employees));
		
		System.out.println("\n--------------------------------------------------------\n");
		System.out.println("The top paid employee is: ");
		Employee topPaidEmployee = employeeService.getTopPaidEmployee(employees);
		topPaidEmployee.print();
		
		System.out.println("\n--------------------------------------------------------\n");
		System.out.print("Enter the minimum years of experience: ");
		int minYears = sc.nextInt();
		
		Employee[] experiencedEmployees = employeeService.getExperiencedEmployees(employees, minYears);
		System.out.println("The experienced employees are: ");
		for (Employee employee: experiencedEmployees) {
			employee.print();
		}
		
		System.out.println("\n--------------------------------------------------------\n");
		sc.nextLine();
		System.out.print("Enter the department name: ");
		String department = sc.nextLine();
		Employee topPaidEmployeeByDepartment = employeeService.getTopPaidEmployeeByDepartment(experiencedEmployees, department);
		System.out.println("The top paid employee of " + department + " department is: ");
		topPaidEmployeeByDepartment.print();
		
		System.out.println("\n--------------------------------------------------------\n");
		System.out.print("Enter the department name: ");
		department = sc.nextLine();
		System.out.println("The average salary is: " + employeeService.getAverageSalaryByDepartment(employees, department));
	}
	
}
