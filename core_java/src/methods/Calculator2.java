package methods;

public class Calculator2 {
	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	public static void subtract(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	public static void multiply(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	public static void divide(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		add(a, b);
		subtract(a, b);
		multiply(a, b);
		divide(a, b);
	}
}
