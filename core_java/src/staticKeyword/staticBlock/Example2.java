package staticKeyword.staticBlock;

public class Example2 {
	static int a = 20;
	
	static {
		int a = 10; // local variable
		System.out.println("SB1");
		System.out.println(a);
		System.out.println(Example2.a);
	}
	
	static {
		System.out.println("SB2");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	
	static {
		System.out.println("SB3");
	}

}
