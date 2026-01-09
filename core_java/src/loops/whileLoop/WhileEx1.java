package loops.whileLoop;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 1; // initialization statement
		
		while (i <= 5) {
			System.out.println("Java");
			i++; // update statement
		}
		// Without the initialization statement and update condition, it will lead to infinite loop
	}
}
