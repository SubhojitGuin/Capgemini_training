package loops.doWhileLoop;

public class SumOfNums {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int sum = 0;

		do {
			sum += i;
			i++;
		} while (i <= n);

		System.out.println("Sum = " + sum);
	}
}
