package objectOrientedProgramming.polymorphism.compileTime;

public class Employee {
	
	int id;
	String name;
	double salary;
	String department;
	
	public Employee() {
		
	}
	
	public Employee(int id) {
		this();
		this.id = id;
	}
	
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	
	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, String department) {
		this(id, name, salary);
		this.department = department;
	}
	
	public void print() {
		System.out.printf("""
				Id: \t\t%s
				Name: \t\t%s
				Salary: \t\t%s
				Department: \t%s
				
				""", id, name, salary, department);
	}
	
	public static void main(String[] args) {
		Employee employee0 = new Employee();
		employee0.print();
		
		Employee employee1 = new Employee(1);
		employee1.print();
		
		Employee employee2 = new Employee(2, "Raj");
		employee2.print();
		
		Employee employee3 = new Employee(3, "Raju", 50000.0);
		employee3.print();
		
		Employee employee4 = new Employee(4, "Dinga", 60000.0, "CSE");
		employee4.print();
	}

}
