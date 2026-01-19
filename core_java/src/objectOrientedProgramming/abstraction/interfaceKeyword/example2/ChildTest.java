package objectOrientedProgramming.abstraction.interfaceKeyword.example2;

public class ChildTest implements Test {
	
	public void m2() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		ChildTest t = new ChildTest();
		// t.m1(); CTE - private method
		t.m2(); // default method of the interface is invoked if it is not overridden in the class
		Test.m3();
		System.out.println(Test.a);
		System.out.println(Test.b);
	}

}
