package methods;

public class BinaryToDecimal {
	
	public static int getDecimal(String binary) {
		int power = 1;
		int sum = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(binary.length() - 1 - i);
			
			if (c == '1') {
				sum += power;
			}
			
			power *= 2;
		}
		
		return sum;
	}
	
	public static int getPower(int b, int p) {
		int pow = 1;

		while (p > 0) {
			pow *= b;
			p--;
		}

		return pow;
	}
	
	public static void main(String[] args) {
		String binary = "101";
		
		System.out.println(getDecimal(binary));
	}
	
}
