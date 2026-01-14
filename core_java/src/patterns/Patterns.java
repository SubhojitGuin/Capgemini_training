package patterns;

public class Patterns {
	public static void p1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p3(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p4(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p6(int n) {
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		p1(3);
//		p2(3);
//		p3(3);
//		p4(3);
//		p5(3);
		p6(3);
	}
}
