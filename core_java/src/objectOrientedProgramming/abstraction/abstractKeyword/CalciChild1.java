package objectOrientedProgramming.abstraction.abstractKeyword;

public class CalciChild1 extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}
	
	public void m1() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		Calculator calculator = new CalciChild1(); // Upcasting
		System.out.println(calculator.add(4, 5));
		System.out.println(calculator.multi(4, 5));
		System.out.println(calculator.sub(5, 4));
//		calculator.m1(); CTE - Can't access it as it is a parent reference due to upcasting
		
		CalciChild1 calciChild1 = new CalciChild1();
		System.out.println(calciChild1.add(1, 2));
		System.out.println(calciChild1.multi(1, 2));
		System.out.println(calciChild1.sub(1, 2));
		calciChild1.m1();
	}
}
