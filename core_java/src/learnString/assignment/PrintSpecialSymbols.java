package learnString.assignment;

public class PrintSpecialSymbols {
	
	public static void main(String[] args) {
		String s = "Hello@#2024!";
		
		int[] count = getCount(s);
		
		for (int i = 0; i < 256; i++) {
			if (!Character.isLetterOrDigit((char)i) && count[i] > 0) {
				System.out.print((char)i + " ");
			}
		}
	}
	
	public static int[] getCount(String s) {
		int[] cc = new int[256];
		
		for (char c: s.toCharArray()) {
			cc[c]++;
		}
		
		return cc;
	}

}
