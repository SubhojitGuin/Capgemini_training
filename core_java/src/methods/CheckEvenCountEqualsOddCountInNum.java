package methods;

public class CheckEvenCountEqualsOddCountInNum {

	public static boolean isEvenEqualsOdd(int num) {
		int even = 0, odd = 0;

		do {
			if (num % 2 == 1)
				odd++;
			else
				even++;

			num /= 10;
		} while (num > 0);

		return odd == even;
	}

	public static void main(String[] args) {
		int num = 1234;

		System.out.println(isEvenEqualsOdd(num));
	}
}
