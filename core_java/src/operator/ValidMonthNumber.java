package operator;

public class ValidMonthNumber {
	public static void main(String[] args) {
		int monthNumber = 5;
		System.out.println(monthNumber + " is a " + ((monthNumber >= 1 && monthNumber <= 12) ? "valid" : "unvalid") + "number");
	}
}
