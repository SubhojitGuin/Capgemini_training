package conditional_stmt;

public class SwitchCaseEx1 {
	public static void main(String[] args) {
		int value = 1;
		
		switch (value) {
		case 1: {
			System.out.println("c1");
		}
			break;
		case 2: {
			System.out.println("c2");
		}
			break;
		case 3: {
			System.out.println("c3");
		}
			break;
		default: {
			System.out.println("no match");
		}
		}
	}
}
