package methods;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		
		System.out.println(isStrongNumber(num) ? "Strong Number" : "Not a Strong Number");
	}

	public static boolean isStrongNumber(int num) {
		int sum = 0;
		int temp = num;
		
		while (temp > 0) {
			sum += getFactorial(temp % 10);
			temp /= 10;
		}

		
		return sum == num;
	}
	
	public static int getFactorial(int num) {
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		
		return fact;
	}
}
