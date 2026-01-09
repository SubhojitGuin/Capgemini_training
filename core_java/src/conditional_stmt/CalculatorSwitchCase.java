package conditional_stmt;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		int num1 = 6, num2 = 5;
		char symbol = '+';
		
		switch (symbol) {
		case '+': {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		break;
		case '-': {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		break;
		case '*': {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		break;
		case '/': {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		break;
		default:
			System.out.println("no match");
		}
	}
}
