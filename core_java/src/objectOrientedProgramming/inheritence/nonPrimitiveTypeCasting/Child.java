package objectOrientedProgramming.inheritence.nonPrimitiveTypeCasting;

public class Child extends Parent {
	public void m2() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = c; // Upcasting
		
		p.m1();
//		p.m2(); Compile Time Error - Parent can't access the child's attributes anymore
		
		Child c1 = (Child) p; // Downcasting
		c1.m1();
		c1.m2(); // Now the child attributes are 
	}
}
