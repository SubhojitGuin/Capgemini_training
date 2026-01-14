package staticKeyword.assignment1;

public class Program {
	public static void palindrome(int a) {
		int num = a;
		int rev = 0;
		
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		if (a == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void prime(int a) {
		boolean isPrime = true;
		
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		isPrime = isPrime && (a != 1);
		
		System.out.println((isPrime) ? "Prime Number" : "Not a Prime Number");
	}
}
