package methods;

public class PowerAndCount {
	public static void main(String[] args) {
		int b = 2;
		int p = 5;

		System.out.println(power(b, p));
		
		int num = 1234;

		System.out.println(getCount(num));
	}
	
	public static int getCount(int num) {
		int count = 0;

		do {
			count++;
			num /= 10;
		} while (num > 0);

		return count;
	}

	public static int power(int b, int p) {
		int pow = 1;

//		for (int i = 1; i <= p; i++) {
//			ans *= b;
//		}

		while (p > 0) {
			pow *= b;
			p--;
		}

		return pow;
	}
}
