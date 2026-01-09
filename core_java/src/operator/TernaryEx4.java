package operator;

public class TernaryEx4 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;

		int big = (a > b) ? a : b;
		big = (big > c) ? big : c;
		big = (big > d) ? big : d;
		System.out.println("biggest number " + big);

		System.out.println("biggest number " + ((a > b) ? (a > c) ? (a > d) ? a : d : (c > d) ? c : d
				: (b > c) ? (b > d) ? b : d : (c > d) ? c : d));
	}
}
