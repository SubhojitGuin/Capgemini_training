package accessModifiers.singletonExample.example2;

public class Driver {
	
	public static void main(String[] args) {
		
		DBConnection con1 = DBConnection.getDBConnection();
		System.out.println(con1);
		
		DBConnection con2 = DBConnection.getDBConnection();
		System.out.println(con2);
		
		DBConnection con3 = DBConnection.getDBConnection();
		System.out.println(con3);

		
	}

}
