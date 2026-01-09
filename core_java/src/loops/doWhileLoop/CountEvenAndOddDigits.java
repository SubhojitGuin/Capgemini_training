package loops.doWhileLoop;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 123;
		int even = 0, odd = 0;
		
		do {
			if (num % 2 == 1) odd++;
			else even++;
			
			num /= 10;
		} while (num > 0);
		
		System.out.println("Number of even digits - " + even);
		System.out.println("Number of odd digits - " + odd);
	}

}
