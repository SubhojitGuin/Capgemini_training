package conditional_stmt;

public class CheckCharacterIsCapitalOrSmallUsingIfElseIf {
	public static void main(String[] args) {
		char c = 'A';
		
		if ('A' <= c && c <= 'Z') {
			System.out.println(c + " is a capital alphabet");
		} else if ('a' <= c && c <= 'z') {
			System.out.println(c + " is a small alphabet");
		}
	}
}
