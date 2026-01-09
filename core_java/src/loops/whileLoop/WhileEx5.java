package loops.whileLoop;

public class WhileEx5 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		int i = n1;
		
		while (i <= n2) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}

}
