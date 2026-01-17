package staticKeyword.staticBlock;

public class Example {
	
	static { // The static blocks are called before the main() method before class loading
		System.out.println("SB1");
	}
	
	static {
		System.out.println("SB2");
		m1();
	}
	
	public static void m1() {
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	
}
