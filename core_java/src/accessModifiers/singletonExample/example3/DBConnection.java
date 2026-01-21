package accessModifiers.singletonExample.example3;

// connection pool
// Create at most 5 objects 
public class DBConnection {
	
	private static int count = 0;
	
	private DBConnection() { 
			
	}
	
	public static DBConnection getDBConnection() { 
		
		if (count < 5) {
			count++;
			return new DBConnection();
		}
		
		return null;
	}
	
	public static void closeDBConnection(DBConnection con) {
		if (con != null) {
			count--;
			con = null;
		}
	}
}
