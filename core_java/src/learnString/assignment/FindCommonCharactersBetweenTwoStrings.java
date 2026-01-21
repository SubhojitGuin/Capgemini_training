package learnString.assignment;

public class FindCommonCharactersBetweenTwoStrings {
	
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "grape";
		
		int[] s1count = getCount(s1);
		int[] s2count = getCount(s2);
		
		System.out.println("The common characters are: ");
		for (int i = 0; i < 26; i++) {
			if (s1count[i] > 0 && s2count[i] > 0) {
				System.out.print((char)(i + 'a') + " ");
			}
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
