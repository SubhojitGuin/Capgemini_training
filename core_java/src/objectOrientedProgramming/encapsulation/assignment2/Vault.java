package objectOrientedProgramming.encapsulation.assignment2;

public class Vault {
	private String username;
	private String password;
	private String resourceName;
	private int resourceCount;
	
	public Vault() {
		
	}
	
	public Vault(String username, String password, String resourceName, int resourceCount) {
		super();
		this.username = username;
		this.password = password;
		this.resourceName = resourceName;
		this.resourceCount = resourceCount;
	}

	public String getUsername() {
		return username;
	}

//	public void setUsername(String username) {
//		this.username = username;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResourceName(String password) {
		if (!this.password.equals(password)) {
			System.out.println("Incorrect password");
			return null;
		}
		
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public int getResourceCount(String password) {
		if (!this.password.equals(password)) {
			System.out.println("Incorrect password");
			return 0;
		}
		
		return resourceCount;
	}

	public void setResourceCount(int resourceCount) {
		if (resourceCount < 0) {
			System.out.println("Invalid Resource Count");
			return;
		}
		this.resourceCount = resourceCount;
	}

	
	
}
