package staticKeyword.nonStaticBlock;

public class Example1 {
	
	{ // Non-static block - This is executed before constructor during object creation.
		System.out.println("N-S 1");
	}
	
	{
		System.out.println("N-S 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		Example1 ns1 = new Example1();
		Example1 ns2 = new Example1();
		System.out.println("main end");
	}
	
}
