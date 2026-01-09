package conditional_stmt;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		String day = "Monday";
		
//		switch (day) {
//		case "Monday":
//		case "Thursday":
//		case "Wednesday": {
//			System.out.println("Bring English book");
//		}
//		break;
//		case "Tuesday":
//		case "Saturday": {
//			System.out.println("Bring Java book");
//		}
//		break;
//		case "Friday": {
//			System.out.println("Bring SQL book");
//		}
//		break;
//		default:
//			System.out.println("Enjoy your Sunday");
//		}
		
		switch (day) {
		case "Monday", "Thursday", "Wednesday": {
			System.out.println("Bring English book");
		}
		break;
		case "Tuesday", "Saturday": {
			System.out.println("Bring Java book");
		}
		break;
		case "Friday": {
			System.out.println("Bring SQL book");
		}
		break;
		default:
			System.out.println("Enjoy your Sunday");
		}
	}

}
