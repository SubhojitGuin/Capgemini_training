package objectOrientedProgramming.inheritence.multiLevel;

public class Vehicle {
	double price;

	public static void main(String[] args) {
		BMW bmw = new BMW(500000.0, "S1000RR");
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		System.out.println(bmw.price);
	}

}

class Bike extends Vehicle {
	String brand;
}

class BMW extends Bike {
	String model;
	
	public BMW() {
		
	}
	
	public BMW(double price, String model) {
		this.price = price;
		this.brand = "BMW";
		this.model = model;
	}
}