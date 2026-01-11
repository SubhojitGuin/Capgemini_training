package methods;

public class XylemPholem {
	public static boolean isXylem(int num) {
		int size = getCount(num);
		int pow10 = getPower(10, size - 1);
		int sum = num / pow10 + num % 10;
		
		num /= 10;

		int sumCopy = 0;

		while (getCount(num) > 1) {
			sumCopy += num % 10;
			num /= 10;
		}

		return sum == sumCopy;
	}

	public static int getCount(int num) {
		int count = 0;

		do {
			count++;
			num /= 10;
		} while (num > 0);

		return count;
	}

	public static int getPower(int b, int p) {
		int pow = 1;

		while (p > 0) {
			pow *= b;
			p--;
		}

		return pow;
	}

	public static void main(String[] args) {
		int num = 12321;
		System.out.println(isXylem(num) ? "Xylem Number" : "Phloem Number");
	}
}
