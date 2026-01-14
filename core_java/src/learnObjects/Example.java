package learnObjects;

public class Example {
	static Student s1; // static
	Student s2; // non-static
	
	public static void main(String[] args) {
		System.out.println(s1);
		
		Example e = new Example();
		e.s2 = new Student();
		System.out.println(e.s2);
	}

}
