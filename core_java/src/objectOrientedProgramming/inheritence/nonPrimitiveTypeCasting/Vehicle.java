package objectOrientedProgramming.inheritence.nonPrimitiveTypeCasting;

public class Vehicle {
	public void travel() {
		System.out.println("Vehicle travel");
	}
	
	public static void main(String[] args) {
		Vehicle v = new Car(); // Upcasting
		v.travel();
		Car c = (Car) v; // Downcasting
		c.travel();
		c.noOfPassengers();
		
		System.out.println();
		v = new Bike(); // Upcasting
		v.travel();
		Bike b = (Bike) v; // Downcasting
		b.travel();
		b.topSpeed();
		
		System.out.println();
		v = new Train(); // Upcasting
		v.travel();
		Train t = (Train) v; // Downcasting
		t.travel();
		t.ticketPrice();
		
		System.out.println();
		v = new Bike(); // Upcasting
		t = (Train) v; // ClassCastException due to different child class in upcasting and downcasting.
//		t.ticketPrice();
	}
}

class Car extends Vehicle {
	public void noOfPassengers() {
		System.out.println("Car no of passengers");
	}
}

class Bike extends Vehicle {
	public void topSpeed() {
		System.out.println("Bike top speed");
	}
}

class Train extends Vehicle {
	public void ticketPrice() {
		System.out.println("Train ticket price");
	}
}