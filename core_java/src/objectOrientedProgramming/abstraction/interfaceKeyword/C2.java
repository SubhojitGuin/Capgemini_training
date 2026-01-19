package objectOrientedProgramming.abstraction.interfaceKeyword;

public class C2 extends C1 implements I1, I2, I3 {
	
//	public void m1() {
//		System.out.println("C2 m1");
//	}
	
	@Override
	public void defaultI3method() {
		System.out.println("Override the implementation");
	}
	
	public static void main(String[] args) {
		I1 i1 = new C2(); // Upcasting
		C1 c1 = new C2();
		I2 i2 = new C2();
		
		I2 i12 = (I2) i1; // Allowed since C2 contains all the properties of the parent classes and interfaces
		I3 i13 = (I3) i1;
		System.out.println("Working");

		C2 c2 = new C2();
		c2.m1();
//		c2.a = 5; CTE - since all variables in interface is `public static final`
		System.out.println(new C2().a);
		
//		I1 i1obj = new I1(); CTE - interface objects are not allowed
		
		c2.defaultI3method();
		I3.staticI3method();
	}

}

class C1 {
	public void m1() {
		System.out.println("C1 m1");
	}
}

interface I1 {
//	public I1() { CTE - interface constructors are not allowed
//		
//	}
	int a = 0; // public static final is automatically added 
	void m1();
}

interface I2 {
//	static { CTE - static blocks are not allowed
//		System.out.println("static");
//	}
	
//	{
//		System.out.println("Non-static"); CTE - non-static blocks are not allowed
//	}
}

interface I3 {
	static void staticI3method() {
		System.out.println("I3 static method");
	}
	
	private void privateI3method() {
		System.out.println("I3 private method");
	}
	
	default void defaultI3method() {
		System.out.println("I3 default method");
	}
}