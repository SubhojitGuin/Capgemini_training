package exceptionPackage.in_builtException.checked;

public class HandleCheckedException {
	
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("handled");
		}
	}

	public static void m1() throws ClassNotFoundException, InterruptedException {
		System.out.println("hii");
		Class.forName("learn.Student");
		Thread.sleep(3000);
		System.out.println("bye");
	}

}
