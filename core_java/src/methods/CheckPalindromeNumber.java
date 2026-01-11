package methods;

public class CheckPalindromeNumber {
	public static String checkPrime(int n) {
		int num = n;
		int rev = 0;
		
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		return (n == rev) ? "good" : "bad";
	}
	public static void main(String[] args) {
		int n = 41;
		System.out.println(checkPrime(n));
	}
}
