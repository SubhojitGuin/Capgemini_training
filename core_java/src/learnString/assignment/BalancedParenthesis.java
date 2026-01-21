package learnString.assignment;

public class BalancedParenthesis {
	
	public static void main(String[] args) {
		String s = "({[]})";
		
		if (isBalanced(s)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	private static boolean isBalanced(String s) {
		int top = -1;
		
		char[] chArray = s.toCharArray();
		
		for (char c: chArray) {
			if (c == '(' ||	c == '{' || c == '[') {
				chArray[++top] = c;
			} else {
				if (!(c == ')' && chArray[top] == '(' || c == '}' && chArray[top] == '{' || c == ']' && chArray[top] == '[')) {
					return false;
				}
				
				top--;
			}
		}
		
		return top == -1;
	}

}
