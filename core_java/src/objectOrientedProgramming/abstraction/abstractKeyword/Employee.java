package objectOrientedProgramming.abstraction.abstractKeyword;

public abstract class Employee {
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r = new Raju(1, "Raju", 10000.0);
		r.printEmployee();
		
		Employee e = new Raju(1, "Raju", 10000.0);
		e.printEmployee();
	}
}

class Raju extends Employee {
	double salary;
	
	public Raju(int id, String name, double salary) {
		super(id, name); // Used to initialize the parent class states
		this.salary = salary;
	}
	
	@Override
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}