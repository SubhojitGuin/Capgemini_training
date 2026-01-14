package objectOrientedProgramming.encapsulation.example;

public class Student {
	String name;
	private int password;
	
	public Student() {

	}
	
	public Student(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}

	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Raju";
		s.password = 123;
		
		System.out.println(s.name);
		System.out.println(s.password);
	}
}
