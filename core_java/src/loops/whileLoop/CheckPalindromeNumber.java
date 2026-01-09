package loops.whileLoop;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int n = 12321;
		int num = n;
		int rev = 0;
		
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		if (n == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
