package loops.forLoop;

public class NoOfFactors {

	public static void main(String[] args) {
		int num = 30;
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) count++;
		}
		
		System.out.println("number of factors " + count);
	}

}
