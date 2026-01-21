package accessModifiers.protectedKeyword.p2;

import accessModifiers.protectedKeyword.p1.C1;

public class C2 extends C1 {
	
	C2() {
		super();
	}
	
	public void m1() {
		System.out.println(super.s);
	}
	
	public static void main(String[] args) {
		System.out.println(C1.s);
		C1 c = new C2();
	}

}
