package exceptionPackage;

public class LearnTryCatchFinally {
	
	public static void main(String[] args) {
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("handled");
//			throw new ArithmeticException();
		} finally {
			System.out.println("finally block");
			System.out.println(7 / 0);
		}
	}

}
