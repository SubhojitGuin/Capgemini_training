package core_java;

/**
 * Type Casting
 */
class Demo {
	public static void main(String[] args) {
		int a = 10;
		long b = a; // widening
		System.out.println(b);
		
		long c = 20;
		int d = (int) c; // narrowing
		System.out.println(d);
		
		double d1 = 55.55;
		int i1 = (int) d1; // narrowing - data loss
		System.out.println(i1);
	}
}
