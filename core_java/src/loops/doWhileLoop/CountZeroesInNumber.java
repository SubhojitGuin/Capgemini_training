package loops.doWhileLoop;

public class CountZeroesInNumber {

	public static void main(String[] args) {
		int n = 12030;
		int num = n;
		int count = 0;
		
		do {
			if (num % 10 == 0) count++;
			num /= 10;
		} while (num > 0);
		
		System.out.println("Number of zeroes in " + n + " is " + count);
	}

}
