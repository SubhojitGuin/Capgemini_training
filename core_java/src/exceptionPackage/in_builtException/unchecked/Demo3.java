package exceptionPackage.in_builtException.unchecked;

public class Demo3 {
	
	public static void main(String[] args) {
		arithmeticExceptionExample();
		stringIndexOutOfBoundsExceptionExample();
		nullPointerExceptionExample();
		arrayIndexOutOfBoundsExceptionExample();
		classCastExceptionExample();
	}

	public static void nullPointerExceptionExample() {
		String s = null;
		try {
			System.out.println(s.toLowerCase());
		} catch (NullPointerException e) { // If you don't know the type of exception use Exception e.
			System.out.println("Found null");
		}
	}

	public static void stringIndexOutOfBoundsExceptionExample() {
		String x = "xyz";
		try {
			System.out.println(x.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of range");
		}
	}

	public static void arithmeticExceptionExample() {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Division by Zero not allowed");
		}
	}
	
	public static void arrayIndexOutOfBoundsExceptionExample() {
		int[] a = {1, 2, 3};
		
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of range");
		}
	}
	
	public static void classCastExceptionExample() {
		A a = new B();
		
		try {
			C c = (C) a;
		} catch (ClassCastException e) {
			System.out.println("Invalid downcasting not allowed");
		}
	}

}

class A {}
class B extends A {}
class C extends A {}
