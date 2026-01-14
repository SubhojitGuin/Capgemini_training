package objectOrientedProgramming.encapsulation.assignment1;

public class Resource {
	private String clientId;
	private String clientSecret;
	private String data;
	
	public Resource() {
		
	}
	
	public Resource(String clientId, String clientSecret, String data) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.data = data;
	}

	public String getClientId() {
		return clientId;
	}

//	public void setClientId(String clientId) {
//		this.clientId = clientId;
//	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getData(String clientSecret) {
		if (!this.clientSecret.equals(clientSecret)) {
			System.out.println("Incorrect Credentials");
			return null;
		}
		
		return data;
	}

	public void setData(String data) {
		if (data.length() < 10) {
			System.out.println("Insufficient data size");
			return;
		}
		
		this.data = data;
	}
	
}
