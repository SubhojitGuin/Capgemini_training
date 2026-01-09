package loops.doWhileLoop;

public class CountNoOfDigits {

	public static void main(String[] args) {
		int n = 123;
		int num = n;
		int count = 0;
		
		do {
			count++;
			num /= 10;
		} while (num > 0);
		
		System.out.println("Number of digits in " + n + " is " + count);
	}

}
