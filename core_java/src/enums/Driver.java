package enums;

public class Driver {
	
	enum Day {Mon, Tues, Thurs} // inner enums - accessible only within the Driver class
	
	public static void main(String[] args) {
//		System.out.println(Day.Monday);
		System.out.println(Day.Mon);
		
//		Day d = Day.Thursday;
//		System.out.println(d);
	}

}
