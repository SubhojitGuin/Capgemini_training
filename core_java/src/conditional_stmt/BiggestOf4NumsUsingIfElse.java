package conditional_stmt;

public class BiggestOf4NumsUsingIfElse {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;
		int big = a;
		
		if (b > big) 
			big = b;
		
		if (c > big)
			big = c;
		
		if (d > big)
			big = d;
		
		System.out.println(big);
	}
}
