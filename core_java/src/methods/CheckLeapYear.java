package methods;

public class CheckLeapYear {
	public static boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			return year % 400 == 0;
		}
		return year % 4 == 0;
	}
	public static void main(String[] args) {
		int year = 2004;
		System.out.println(year + " is a " + (isLeapYear(year) ? "leap" : "non-leap") + " year");
	}

}
