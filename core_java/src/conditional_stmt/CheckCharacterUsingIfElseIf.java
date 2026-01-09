package conditional_stmt;

public class CheckCharacterUsingIfElseIf {
	public static void main(String[] args) {
		char c = 'A';
		
		if ('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z' ) {
			System.out.println(c + " is an alphabet");
		} else if ('0' <= c && c <= '9') {
			System.out.println(c + " is a digit");
		} else {
			System.out.println(c + " is a special character");
		}
	}
}
