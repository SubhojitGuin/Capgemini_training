package methods;

public class DisariumNumber {

	public static void main(String[] args) {
		int num = 135;
		
		System.out.println(isDisarium(num) ? "Disarium Number" : "Not a Disarium Number");
	}

	public static boolean isDisarium(int num) {
		int temp = num;
		int power = getCount(num);
		int sum = 0;
		
		while (temp > 0) {
			sum += getPower(temp % 10, power);
			temp /= 10;
			power--;
		}
		
		return num == sum;
	}
	
	public static int getCount(int num) {
		int count = 0;

		do {
			count++;
			num /= 10;
		} while (num > 0);

		return count;
	}
	
	public static int getPower(int b, int p) {
		int pow = 1;

		while (p > 0) {
			pow *= b;
			p--;
		}

		return pow;
	}
	
}
