package learnObjects;

public class Student4 { 
	// States
	int id;
	String name;
	long phone;
	
	// Constructor Overloading - Same constructor but different formal arguments
	public Student4(int id) { // Non-Parameterized constructor
		this.id = id;
	}
	
	public Student4(int id, String name) { // Parameterized constructor
		this(id);
		this.name = name;
	}
	
	public Student4(int id, String name, long phone) { // Parameterized constructor
		this(id, name);
		this.phone = phone;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println("------------");
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4(10, "Raju", 888);
		s1.display();
		Student4 s2 = new Student4(11, "Raj");
		s2.display();
		Student4 s3 = new Student4(12);
		s3.display();
	}

}
