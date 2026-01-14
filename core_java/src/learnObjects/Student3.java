package learnObjects;

public class Student3 { 
	// States
	int id;
	String name;
	
	// Constructor Overloading - Same constructor but different formal arguments
	public Student3() { // Non-Parameterized constructor
		System.out.println("constructor");
	}
	
	public Student3(int id, String name) { // Parameterized constructor
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.display();
		Student3 s2 = new Student3(10, "Raju");
		s2.display();
	}

}
