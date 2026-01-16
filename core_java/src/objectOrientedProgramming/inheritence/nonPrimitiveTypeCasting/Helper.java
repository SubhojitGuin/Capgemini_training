package objectOrientedProgramming.inheritence.nonPrimitiveTypeCasting;

public class Helper {
	
	public static void getVehicle(Vehicle v) {
		System.out.println(v instanceof Vehicle); // true
		
		if (v instanceof Bike b) { // if bike
//			System.out.println(b instanceof Vehicle); // true
			b.topSpeed();
		} else if (v instanceof Car c) {
			c.noOfPassengers();
		} else if (v instanceof Train t) {
			t.ticketPrice();
		}
	}

	public static void main(String[] args) {
//		getVehicle(new Bike());
//		getVehicle(new Train());
//		getVehicle(new Car());
		
		Bike b = new Bike();
		System.out.println(b instanceof Bike); //true
		System.out.println(b instanceof Vehicle); //true
		
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Vehicle); //true
		System.out.println(v instanceof Bike); //false
		
		Vehicle v2 = new Bike();
		System.out.println(v2 instanceof Bike); //true
		System.out.println(v2 instanceof Vehicle); //true
		System.out.println(v2 instanceof Car); //false
		
	}
	
}
