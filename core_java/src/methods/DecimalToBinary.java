package methods;

public class DecimalToBinary {
	public static String getBinary(int num) {
		String binary = "";
		
		while (num > 0) {
			binary = (num % 2) + binary;
			num /= 2;
		}
		
		return binary;
	}
	
	public static void main(String[] args) {
		int num = 4;
		System.out.println(getBinary(num));
	}
	
}
