package staticKeyword.nonStaticBlock;

public class Employee {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name + " is working");
	}
	
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e2.id = 101;
		e2.name = "Raju";
		e2.salary = 5.0;
		e2.work();
		e2.printEmployee();
		
		e1.work();
		e1.printEmployee();
	}

}
