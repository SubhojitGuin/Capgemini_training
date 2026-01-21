package objectClass;

public class Employee {
	
	int id;
	String name;
	double salary;
	String department;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " name:" + name + " salary" + salary + " department:" + department;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Dinga", 10.0, "CSE");
//		System.out.println(emp1);
		
		Employee emp2 = new Employee(2, "Dingi", 100.0, "CSE");
//		System.out.println(emp2);
		
		Employee emp3 = new Employee(3, "Dingu", 12.0, "CSE");
//		System.out.println(emp3);
		
		Employee emp4 = new Employee(4, "Dingo", 120.0, "CSE");
//		System.out.println(emp4);
		
		Employee[] employees = {emp1, emp2, emp3, emp4};
		for (Employee emp: employees) {
			System.out.println(emp);
		}
	}

}
