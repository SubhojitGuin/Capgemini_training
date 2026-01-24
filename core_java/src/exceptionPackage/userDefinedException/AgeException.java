package exceptionPackage.userDefinedException;


// create unchecked exception

public class AgeException extends RuntimeException {
	
	public AgeException(String message) {
		super(message); //passes the message to the constructor of Throwable to initialize the detailMessage
	}
	
	public static void validateAge(int age) {
		if (age > 0) {
			System.out.println("Age is valid");
		} else {
			throw new AgeException(age + " is invalid");
		}
	}
	
	public static void main(String[] args) {
		int age1 = 10;
		validateAge(age1);
		
		try {
			int age2 = -1;
			validateAge(age2);
		} catch (AgeException e) {
			System.out.println("AgeException handled");
		}
	}
	
}
