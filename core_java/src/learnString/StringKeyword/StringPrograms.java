package learnString.StringKeyword;

public class StringPrograms {
	
	public static void main(String[] args) {
//		countAlphabets();
//		convertToLowerCase();
//		convertToUpperCase();
//		removeDigitsFromString();
//		countAlphabetsDigitsAndSpecialCharactersInString();
//		convertEveryFirstCharacterOfWordToUpperCase();
//		convertEveryLastCharacterOfWordToLowerCase();
//		swapLastCharacterAndFirstCharacterOfEveryWord();
		removeSpaces();
	}
	
	public static void removeSpaces() {
		String s = "      this    is a  java program  ";
		String ans = "";
		String[] ss = s.split(" ");
		
		for (String temp: ss) {
			ans += temp;
		}
		
		System.out.println(ans);
		
		System.out.println(s.replaceAll(" ", ""));
	}

	public static void swapLastCharacterAndFirstCharacterOfEveryWord() {
		String s = "      this    is a  java program  ";
		char[] cs = s.toCharArray();
		
		for (int ptr = 0; ptr < cs.length; ptr++) {
			if (cs[ptr] == ' ') continue;
			
			int ptr2 = ptr;
			while (ptr2 < cs.length && cs[ptr2] != ' ') {
				ptr2++;
			}
			
			char c = cs[ptr];
			cs[ptr] = cs[ptr2 - 1];
			cs[ptr2 - 1] = c;
			
			ptr = ptr2 - 1;
		}
		
		System.out.println(new String(cs));
		
	}

	public static void convertEveryLastCharacterOfWordToLowerCase() {
		String s = "      thiS    is A  javA prograM";
		char[] cs = s.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			if (i == cs.length - 1 || cs[i + 1] == ' ') {
				if (cs[i] >= 'A' && cs[i] <= 'Z') 
					cs[i] = (char)(cs[i] + 32);
			}
		}
		
		System.out.println(new String(cs));
	}

	public static void convertEveryFirstCharacterOfWordToUpperCase() {
		String s = "      this    is a  java program  ";
		boolean firstChar = true;
		String ans = "";
		
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
		for (char c: s.toCharArray()) {
			
			if (c == ' ') {
				firstChar = true;
				ans += c;
			} else {
				if (firstChar) {
					firstChar = false;
					if (c >= 'a' && c <='z') {
						ans += (char)(c - 32);
					} else {
						ans += c;
					}
				} else {
					ans += c;
				}
			}
		}
		
		System.out.println(ans);
	}

	public static void countAlphabetsDigitsAndSpecialCharactersInString() {
		String s = "abc123defABC@#$%";
		int alpha = 0, digits = 0, special = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				alpha++;
			} else if (c >= '0' && c <= '9') {
				digits++;
			} else {
				special++;
			}
		}
		
		System.out.println("Alphabets: " + alpha);
		System.out.println("Digits: " + digits);
		System.out.println("Special Characters: " + special);
	}

	public static void removeDigitsFromString() {
		String s = "abc123def";
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= '0' && c <= '9') {
				continue;
			}
			
			ans += c;
		}
		
		System.out.println(ans);
	}

	public static void convertToLowerCase() {
		String s = "ABCabc";
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				ans += (char)(c + 32);
			} else {
				ans += c;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void convertToUpperCase() {
		String s = "ABCabc";
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= 'a' && c <= 'z') {
				ans += (char)(c - 32);
			} else {
				ans += c;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void countAlphabets() {
		String s = "abc1234asdfs";
		int count = 0;
		
//		for (char c: s.toCharArray()) {
//			if (Character.isLetter(c))
//				count++;
//		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
				count++;
		}
		
		System.out.println("The number of alphabets are: " + count);
	}

}
