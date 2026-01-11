package methods;

public class CountOnesInDecimal {
	
	public static int countOnes(int num) {
		int count = 0;
		
		while (num > 0) {
			if (num % 10 == 1) count++;
			num /= 10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int num = 12341111;
		
		System.out.println(countOnes(num));
	}
}
