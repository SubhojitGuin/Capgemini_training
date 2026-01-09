package operator;

public class SingleOrMultiDigitNumber {
	public static void main(String[] args) {
		int number = -5;
		
		System.out.println(number + " is a " + ((Math.abs(number) / 10 == 0) ? "single-digit" : "multi-digit") + " number");
	}
}
