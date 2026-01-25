package exceptionPackage;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // prints the message of the exception
			e.printStackTrace(); // prints the stack trace
		}
		System.out.println("bye");
	}

}
