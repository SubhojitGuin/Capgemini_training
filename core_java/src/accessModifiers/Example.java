package accessModifiers;

public class Example {
	
	static String a = "default var";
	
	private static void m1() {
		System.out.println("private method");
	}
	
	private Example() {
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Example example = new Example();
	}
}
