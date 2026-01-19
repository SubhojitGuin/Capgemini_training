package objectOrientedProgramming.abstraction.interfaceKeyword;

public class CalciLogic implements Calci {

	@Override
	public int add(int a, int b) { // must mention `public` as it is implicitly set in the interface
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}
	
	@Override
	public void m1() {
		System.out.println("CalciLogic m1 method");
	}

	public static void main(String[] args) {
		Calci calci = new CalciLogic();
		System.out.println(calci.add(4, 5));
		calci.m1();
		
		CalciLogic cl = (CalciLogic) calci;
		System.out.println(cl.sub(7, 3));
		System.out.println(cl.multi(5, 6));

	}

}
