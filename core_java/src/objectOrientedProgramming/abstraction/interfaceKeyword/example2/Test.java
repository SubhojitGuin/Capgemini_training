package objectOrientedProgramming.abstraction.interfaceKeyword.example2;

public interface Test {
	
	public static final int a = 30;
	int b = 20; // by default `public static final` is added
	
	// non static method
	private void m1() { // Can be called only inside default methods | helper method for default methods
		System.out.println("private method");
	}
	
	// scope - public, modifier - default
	// non static method
	default void m2() { // If the child does not override, then the default method is implemented
		System.out.println("default method");
		m1();
	}
	
	public static void m3() { // Valid for JDK 8 and above
		System.out.println("hii");
	}

}

