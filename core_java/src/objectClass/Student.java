package objectClass;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// java.util.Objects is a utility class
		return Objects.hash(id, name);
	}
	
	public boolean compareTo(Student student) {
		return this.hashCode() == student.hashCode();
	}
	
	@Override
	public boolean equals(Object o) { // Upcasting happens here Student -> Object
		// compares the object address
		if (this == o) { // Check if both are referring to the same object
			return true;
		}
		
		// null object OR same class
		if (o == null || this.getClass() != o.getClass()) { //handles NullPointerException and ClassCastException
			return false;
		}
		
		Student s = (Student) o; // Downcasting - to access the Child class states		
		// compares the states of an object
		return this.id == s.id && this.name == s.name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(10, "xyz");
		Student s2 = new Student(10, "xyz");
		Student s3 = s1;
		Student s4 = null;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("S1 equals S3: " + s1.compareTo(s3));
		System.out.println("S1 equals S2: " + s1.compareTo(s2));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); // compares the address of the 2 objects only
		System.out.println(s1.equals(s3));
		
//		System.out.println(s4.equals(s1)); RTE - NullPointerException: since s4 is null, equals() can't be invoked
		System.out.println(s1.equals(s4));
		
		Person p = new Person(101, "raju");
		System.out.println(p.getClass());
		System.out.println(s1.getClass());
		
		System.out.println(p.getClass().toString().equals(s1.getClass().toString()));
//		System.out.println(s1.equals(p));
		
		Object o = new Student(200, "abc");
		System.out.println(o.getClass()); // objectClass.Student - returns the qualified class name of Child class as type, not reference class
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(p));
		System.out.println(s1.equals(s3));
	}

}
