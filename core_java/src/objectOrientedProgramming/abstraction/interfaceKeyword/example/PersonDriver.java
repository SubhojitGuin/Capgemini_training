package objectOrientedProgramming.abstraction.interfaceKeyword.example;

public class PersonDriver {
	
	public static void main(String[] args) {
//		Person p = new Person();
//		
//		// Loose Coupling - any type of child object can be passed - weak relationship
//		Vehicle v = new Car();
//		p.setV(v);
//		p.setV(new Bike());
//		
//		p.getV().price();
//		p.getV().type();
		
		Vehicle v = HelpVehicle.getVehicle(); // Abstraction - Here, we don't see the child class it contains, just implement the functionalities
//		System.out.println(v.getClass());
		v.type();
		v.price();
	}

}
