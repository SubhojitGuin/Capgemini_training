package objectOrientedProgramming.inheritence.constructorChaining;

class SuperParent {
	int a = 10;
	
	public void m1() {
		System.out.println("parent");
	}
	
}

public class SuperChild extends SuperParent {
	int a = 20;
	
	public void m2() {
		System.out.println(a);
		System.out.println(super.a);
		super.m1(); // same as this.m1() if m1() does not exist in child
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		SuperChild c = new SuperChild();
		c.m2();
	}
}