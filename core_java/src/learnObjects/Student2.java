package learnObjects;

public class Student2 { 
	// States
	int id;
	String name;
	
	public void initialize(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Behaviors
	public void display() {
		System.out.println(id); // NS
		System.out.println(name); // NS
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.display();
		s.initialize(1, "Raja");
		s.display();
	}

}
