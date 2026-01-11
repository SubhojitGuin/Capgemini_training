package methods;

public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		char symbol = '+';

		switch (symbol) {
		case '+': {
			System.out.println(a + " + " + b + " = " + add(a, b));
		}
			break;
		case '-': {
			System.out.println(a + " - " + b + " = " + subtract(a, b));
		}
			break;
		case '*': {
			System.out.println(a + " * " + b + " = " + multiply(a, b));
		}
			break;
		case '/': {
			System.out.println(a + " / " + b + " = " + divide(a, b));
		}
			break;
		default: {
			System.out.println("Incorrect Symbol");
		}
		}

	}
}
