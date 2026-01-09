package methods;

public class Example {
	public static void m1() { // Called method
		System.out.println("M1");
	}
	public static void main(String[] args) { // Caller method
		System.out.println("Main"); 
		m1(); // method call statement
	}
}
