package learnObjects;

public class Employee2 {
	public Employee2() {
		System.out.println("C1");
	}
	
	public Employee2(int a) {
		this(); // Constructor chaining
		System.out.println("C2");
	}
	
	public static void main(String[] args) {
		Employee2 e = new Employee2(25);
	}
}
