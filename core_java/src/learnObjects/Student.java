package learnObjects;

public class Student { // This is a blueprint for the objects
	// States
	int id;
	String name;
	
	{
		// Non-static block - initializes non static variables
		System.out.println("Non Static Block");
	}

	// Behaviors
	public void study() {
		System.out.println(id); // In non-static context, variables can be accessed directly
		System.out.println(name);
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s); // This gives the address. This is not the exact memory address, it is encrypted and then provided.
		System.out.println(s.id); // 0
		System.out.println(s.name); // null
		
		s.id = 101;
		s.name = "Raju";
		System.out.println(s.id); // 101
		System.out.println(s.name); // "Raju"
		s.study();
	}

}
