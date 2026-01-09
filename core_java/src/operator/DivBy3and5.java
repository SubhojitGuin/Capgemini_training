package operator;

public class DivBy3and5 {
	public static void main(String[] args) {
		int num = 45;
		
		System.out.println(num + " is " + ((num % 3 == 0 && num % 5 == 0) ? "" : "not ") + "divisible by 3 and 5");
	}
}
