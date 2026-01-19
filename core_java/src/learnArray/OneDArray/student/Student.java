package learnArray.OneDArray.student;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void print() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}

}
