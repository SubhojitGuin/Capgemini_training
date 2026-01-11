package methods;

public class HappyNumber {
	public static void main(String[] args) {
		int num = 42;
		
		System.out.println(isHappyNumber(num) ? "Happy Number" : "Not a Happy Number");
	}

	public static boolean isHappyNumber(int num) {
		while (getCount(num) > 1) {
			int sum = 0;
			
			while (num > 0) {
				int r = num % 10;
				sum += r * r;
				num /= 10;
			}
			
			num = sum;
		}
		
		return num == 1 || num == 7;
	}
	
	public static int getCount(int num) {
		int count = 0;

		do {
			count++;
			num /= 10;
		} while (num > 0);

		return count;
	}
}
