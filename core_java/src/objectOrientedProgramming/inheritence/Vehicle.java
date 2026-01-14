package objectOrientedProgramming.inheritence;

public class Vehicle {
	String brand;
	String color;
	double price;
	
	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Bike b = new Bike("BMW", "blue", 150.0);
		b.printVehicle(); // Acquired from parent
		
		Vehicle v = new Vehicle();
		v.brand = "Honda";
		v.color = "red";
		v.price = 10;
		v.printVehicle();
	}
}

class Bike extends Vehicle {
	
	Bike(String brand, String color, double price) {
		super();
		this.brand = brand; // inherited
		this.color = color; // inherited
		this.price = price; // inherited
	}
	
	
}