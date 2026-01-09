package conditional_stmt;

public class BiggestOf3NumsUsingIfElse {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int big = a;
		
		if (b > big) 
			big = b;
		
		if (c > big)
			big = c;
		
		System.out.println(big);
	}
}
