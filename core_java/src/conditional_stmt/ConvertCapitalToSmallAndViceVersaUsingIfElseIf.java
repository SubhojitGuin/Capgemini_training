package conditional_stmt;

public class ConvertCapitalToSmallAndViceVersaUsingIfElseIf {
	public static void main(String[] args) {
		char c = 'a';
		
		if ('A' <= c && c <= 'Z') {
			System.out.println(c + "'s small letter is " + (char) (c + 32));
		} else if ('a' <= c && c <= 'z') {
			System.out.println(c + "'s capital letter is " + (char) (c - 32));
		}
	}
}
