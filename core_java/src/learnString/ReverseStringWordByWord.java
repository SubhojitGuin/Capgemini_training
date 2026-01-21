package learnString;

public class ReverseStringWordByWord {
	
	public static void main(String[] args) {
		String s = "I am Student";
		String ans = "";
		
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
//		
//		String[] ss = sb.toString().split(" ");
//
//		for (String temp: ss) {
//			StringBuilder sb1 = new StringBuilder(temp);
//			sb1.reverse();
//			ans += sb1.toString() + " ";
//		}
		
		String[] ss = s.split(" ");
		
		for (int i = ss.length - 1; i >= 0; i--) {
			ans += ss[i] + " ";
		}
		
		System.out.println(ans);
	}

}
