package methods;

public class Armstrong {
	
	public static void main(String[] args) {
		int num = 1634;

		System.out.println(checkArmstrong(num) ? "Armstrong number" : "Not an Armstrong number");
	}

	public static boolean checkArmstrong(int num) {
		int size = getCount(num);
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			int r = temp % 10;
			sum += power(r, size);
			temp /= 10;
		}

		return sum == num;
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
