package methods;

public class GreatestAndSmallestOf3Nums {
	public static void getGreatest(int a, int b, int c) {
		int big = a;
		big = (big > b) ? big : b;
		big = (big > c) ? big : c;
		System.out.println(big);
		
//		System.out.println((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	}

	public static void getSmallest(int a, int b, int c) {
		int small = a;
		small = (small < b) ? small : b;
		small = (small < c) ? small : c;
		System.out.println(small);
		
		
		

//		System.out.println((a < c) ? (a < b) ? a : b : (c < b) ? c : b);
	}

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;

		getGreatest(a, b, c);
		getSmallest(a, b, c);
	}
}
