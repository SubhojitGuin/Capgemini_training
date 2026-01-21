package learnString;

import java.util.Arrays;

public class CheckAnagram {
	
	public static void main(String[] args) {
		String s1 = "rescue";
		String s2 = "secure";
		
		int[] s1count = getCount(s1);
		int[] s2count = getCount(s2);
		
		if (Arrays.equals(s1count, s2count)) {
			System.out.println("Words are anagram");
		} else {
			System.out.println("Words are not anagram");
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
