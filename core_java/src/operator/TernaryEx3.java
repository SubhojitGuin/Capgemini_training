package operator;

public class TernaryEx3 {
	public static void main(String[] args) {
		int a = 1, b = 4, c = 3;

		System.out.println("biggest number " + ((a > b) ? (a > c) ? a : c : (b > c) ? b : c));
		System.out.println("biggest number " + ((a > b && a > c) ? a : (b > c) ? b : c));
	}
}
