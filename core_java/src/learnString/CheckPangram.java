package learnString;

public class CheckPangram {
	
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		
		int[] s1count = getCount(s1);
		
		boolean isPangram = true;
		
		for (int i: s1count) {
			if (i == 0) {
				isPangram = false;
				break;
			}
		}
		
		if (isPangram) {
			System.out.println("Pangram");
		} else {
			System.out.println("not Pangram");
		}
	}
	
	public static int[] getCount(String s) {
		int[] cc = new int[26];
		
		for (char c: s.toCharArray()) {
			if (Character.isLetter(c)) {
				c = Character.toLowerCase(c);
				cc[c - 'a']++;
			}
		}
		
		return cc;
	}

}
