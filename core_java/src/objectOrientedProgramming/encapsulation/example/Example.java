package objectOrientedProgramming.encapsulation.example;

public class Example {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "Raju";
//		s.setPassword(123); // Cannot use s.password as it is private
		
		Student s = new Student("Raju", 123);
		
		System.out.println(s.name);
		System.out.println(s.getPassword()); // Cannot use s.password as it is private
	}
}
