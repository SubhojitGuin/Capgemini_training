package learnString.assignment;

public class RemoveAllDigits {
	
	public static void main(String[] args) {
		String s = "ab3g56ty";
		String ans = "";
		
		for (char c: s.toCharArray()) {
			if (c >= '0' && c <= '9') continue;
			ans += c;
		}
		System.out.println(ans);
	}
	
}
