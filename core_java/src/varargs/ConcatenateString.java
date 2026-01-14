package varargs;

public class ConcatenateString {
	
	public static void concatenate(String...strings) {
		String s = "";
		
		for (String string: strings) {
			s += string;
		}
		
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		concatenate("A", "BC", "DEF");
	}
}
