package learnString;

public class CheckFrequency {
	
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		
		int[] s1count = getCount(s1);
		
		for (int i = 0; i < 256; i++) {
			if (s1count[i] > 0) {
				System.out.println("'" + (char)i + "' = " + s1count[i]);
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
