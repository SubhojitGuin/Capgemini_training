package learnObjects;

public class Employee { 
	// States
	int id;
	String name;
	double salary;
	
	public void initialize(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Behaviors
	public void display() {
		System.out.println(id); // NS
		System.out.println(name); // NS
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee s = new Employee();
		s.initialize(1, "Dinga", 5.5);
		s.display();
	}

}
