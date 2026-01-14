package objectOrientedProgramming.encapsulation.example3;

public class Account {
	private int id;
	private double balance;
	private String password;

	public Account() {

	}

	public Account(int id, double balance, String password) {
		this.id = id;
		this.balance = balance;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance(String password) { // Verify
		if (!this.password.equals(password)) {
			System.out.println("Error: Incorrect Password");
			return 0.0d;
		}

		return balance;
	}

	public void setBalance(double balance) { // Validate
		if (balance < 0) {
			System.out.println("Error: Incorrect Balance " + balance);
			return;
		}
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
