package learnObjects;

public class Example2 {
	// Primitive 
	int a1; // int - Primitive datatype
	static int a2;
	
	// Non-primitive (Multi-valued data)
	Student s1; // Student - Non-primitive datatype
	static Student s2;
	
	public Example2() { // Constructor - special non-static method
		super();
		
		// Scope of static and non-static variables is same as non-static method
		System.out.println(a1);
		System.out.println(this.a1);
		System.out.println(a2);
		
		System.out.println(s1);
		System.out.println(this.s1);
		System.out.println(s2);
	}

	public void m1() {
		System.out.println(a1);
		System.out.println(this.a1);
		System.out.println(a2);
		
		System.out.println(s1);
		System.out.println(this.s1);
		System.out.println(s2);
	}
	
	public static void m2() {
		Example2 e = new Example2();
		System.out.println(e.a1);
		System.out.println(a2);
		
		System.out.println(e.s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		Example2 e = new Example2();
		e.m1();
		m2();
	}

}
