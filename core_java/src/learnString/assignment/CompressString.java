package learnString.assignment;

public class CompressString {
	
	public static void main(String[] args) {
		String s = "aaabbccc";
		
		char curr = s.charAt(0);
		int count = 0;
		
		String ans = "";
		
		for (char c: s.toCharArray()) {
			if (curr == c) {
				count++;
			} else {
				ans += curr + "" + count;
				curr = c;
				count = 1;
			}
		}
		
		ans += curr + "" + count;
		System.out.println(ans);
	}

}
