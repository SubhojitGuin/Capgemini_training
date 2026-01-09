package methods;

public class Hotel {
	public static void server() {
		System.out.println("Serving Food");
	}
	public static void chef() {
		System.out.println("Preparing Food");
	}
	public static void cashier() {
		System.out.println("Counting money");
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		chef();
		server();
		cashier();
		System.out.println("Main end");
	}
}
