package objectOrientedProgramming.polymorphism.runTime;

public class Parent {
	void home() {
		System.out.println("Parent");
	}
	
	public static void home2() {
		System.out.println("Parent");
	}
	
	public Number m1() {
		return 10;
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.home();
		p.home2();
		
		System.out.println();
		Child c = new Child();
		c.home(); // Overriding
		c.home2();
		c.bike();
		System.out.println(c.m1());
		
		System.out.println();
		Parent p1 = new Child(); // Upcasting
		p1.home(); // Overriding
		p1.home2(); // Method hiding - since we+ are making the same *static* method of the parent
		System.out.println(p1.m1()); // Overriding12
	}
}

class Child extends Parent {
	@Override
	public void home() {
		System.out.println("Child");
	}
	
	@Override
	public Integer m1() {
		return 30;
	}
	
	public static void home2() { // Method hiding - since we are making the same *static* method of the parent
		System.out.println("Child");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
}
