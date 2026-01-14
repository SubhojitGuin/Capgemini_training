package objectOrientedProgramming.encapsulation.example3;

public class Driver {
	public static void main(String[] args) {

		Account acc = new Account(1, 5000.0, "abc");

		acc.setBalance(-50.0);

		System.out.println(acc.getId());
		System.out.println(acc.getBalance("abc"));
		System.out.println(acc.getPassword());
	}
}
