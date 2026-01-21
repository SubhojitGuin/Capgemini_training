package learnString.assignment;

public class CheckIsogram {
	
	public static void main(String[] args) {
		String s = "machine";
		
		int[] count = getCount(s);
		
		boolean isIsogram = true;
		for (int i : count) {
			if (i > 1) {
				isIsogram = false;
				break;
			}
		}
		
		if (isIsogram) {
			System.out.println("Isogram");
		} else {
			System.out.println("not Isogram");
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
