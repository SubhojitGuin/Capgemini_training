package methods;

public class DecimalToHex {
	
	public static char getChar(int n) {
		if (n >= 10 && n <= 15) return (char)('A' + n - 10);
		return (char)(n + '0');
	}
	
	public static String getHex(int num) {
		String hex = "";
		
		while (num > 0) {
			hex = getChar(num % 16) + hex;
			num /= 16;
		}
		
		return hex;
	}

	public static void main(String[] args) {
		int num = 30;
		
		System.out.println(getHex(num));
	}

}
