package accessModifiers.singletonExample.example2;

public class DBConnection {
	
	private static DBConnection con; // 2: To store the singleton object
	
	private DBConnection() { // 1: Prevent object creation in other classes
			
	}
	
	public static DBConnection getDBConnection() { // 3: Returns the singleton object
		if (con == null) {
			con = new DBConnection();
		}
		
		return con;
	}
}
