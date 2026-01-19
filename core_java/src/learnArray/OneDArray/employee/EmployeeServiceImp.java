package learnArray.OneDArray.employee;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {
		int count = 0;
		
		for (Employee employee: employees) {
			if (employee.getSalary() >= minSalary)
				count++;	
		}
		
		Employee[] highSalaryEmployees = new Employee[count];
		
		int idx = 0;
		for (Employee employee: employees) {
			if (employee.getSalary() >= minSalary)
				highSalaryEmployees[idx++] = employee;
		}
		
		return highSalaryEmployees;
	}

	@Override
	public double calculateAverageSalary(Employee[] employees) {
		double totalSalary = 0.0d;
		
		for (Employee employee: employees) {
			totalSalary += employee.getSalary();
		}
		
		return totalSalary / employees.length;
	}

	@Override
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee topPaidEmployee = employees[0];
		
		for (Employee employee: employees) {
			if (employee.getSalary() > topPaidEmployee.getSalary()) {
				topPaidEmployee = employee;
			}
		}
		
		return topPaidEmployee;
	}

	@Override
	public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {
		int count = 0;
		
		for (Employee employee: employees) {
			if (employee.getYearsOfExperience() >= minYears)
				count++;
		}
		
		Employee[] experiencedEmployees = new Employee[count];
		
		int idx = 0;
		for (Employee employee: employees) {
			if (employee.getYearsOfExperience() >= minYears)
				experiencedEmployees[idx++] = employee;
		}
		
		return experiencedEmployees;
	}

	@Override
	public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {
		Employee topPaidEmployee = null;
		
		for (Employee employee: employees) {
			if (!employee.getDepartment().equals(department)) continue;
			
			if (topPaidEmployee == null || topPaidEmployee.getSalary() < employee.getSalary())
				topPaidEmployee = employee;
		}
		
		return topPaidEmployee;
	}

	@Override
	public double getAverageSalaryByDepartment(Employee[] employees, String department) {
		double totalSalary = 0.0d;
		int count = 0;
		
		for (Employee employee: employees) {
			if (employee.getDepartment().equals(department)) {
				totalSalary += employee.getSalary();
				count++;
			}
		}
		
		return totalSalary / count;
	}

}
