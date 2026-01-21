package accessModifiers.singletonExample.example3;

public class Driver {
	
	public static void main(String[] args) {
		
		DBConnection con1 = DBConnection.getDBConnection();
		System.out.println(con1);
		DBConnection.closeDBConnection(con1);
		System.out.println(con1);
		
		
		DBConnection con2 = DBConnection.getDBConnection();
		System.out.println(con2);
		
		DBConnection con3 = DBConnection.getDBConnection();
		System.out.println(con3);
		
		DBConnection con4 = DBConnection.getDBConnection();
		System.out.println(con4);
		
		DBConnection con5 = DBConnection.getDBConnection();
		System.out.println(con5);
		
		DBConnection con6 = DBConnection.getDBConnection();
		System.out.println(con6);
		
	}

}
