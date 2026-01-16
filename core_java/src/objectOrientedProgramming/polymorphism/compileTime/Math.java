package objectOrientedProgramming.polymorphism.compileTime;

public class Math {
	
	public static void add(int a, int b) {
		System.out.println("2 int");
		System.out.println(a + b);
	}
	
	public void add(float a, float b, int c) {
		System.out.println("3 non-static int");
		System.out.println(a + b + c);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println("3 int");
		System.out.println(a + b + c);
	}
	
	public static int add(int a, int b, int c, int d) {
		System.out.println("4 int");
		return a + b + c + d;
	}
	
	public static void add(float a, float b) {
		System.out.println("2 float");
		System.out.println(a + b);
	}
	
	public static void add(double a , double b) {
		System.out.println("2 double");
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		add(2, 3);
		add(2, 3, 4);
		add(5.6f, 6.5f);
		add(5.9, 9.5);
		System.out.println(add(2, 3, 4, 5));
		new Math().add(5.4f, 8.5f, 8);
	}

}
