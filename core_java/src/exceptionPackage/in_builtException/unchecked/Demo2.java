package exceptionPackage.in_builtException.unchecked;

public class Demo2 {
	
	public static void main(String[] args) {
		System.out.println("hii");
		
		// exception handling
		// continue normally by continuing the program even if an exception occurs using the handling instruction
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("zero");
		}
		
		System.out.println("bye");
	}

}
