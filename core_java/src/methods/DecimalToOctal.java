package methods;

public class DecimalToOctal {
	
	public static String getOctal(int num) {
		String octal = "";
		
		while (num > 0) {
			octal = (num % 8) + octal;
			num /= 8;
		}
		
		return octal;
	}

	public static void main(String[] args) {
		int num = 9;
		System.out.println(getOctal(num));
	}

}
