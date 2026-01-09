package loops.doWhileLoop;

public class AvgOfDigits {

	public static void main(String[] args) {
		int n = 123;
		int num = n;
		int count = 0;
		int sum = 0;
		
		do {
			count++;
			sum += num % 10;
			num /= 10;
		} while (num > 0);
		
		System.out.println("Average of digits in " + n + " is " + (sum / count));
	}

}
