package objectOrientedProgramming.inheritence.hybrid;

public class Vehicle {
	String color;

	public static void main(String[] args) {
		BMW bmw = new BMW("S1000RR", 50000.0, "blue");
		System.out.println(bmw.brand);
		System.out.println(bmw.color);
		System.out.println(bmw.model);
		System.out.println(bmw.price);
		
		Car car = new Car("Audi", "blue", 100000.0);
		System.out.println(car.brand);
		System.out.println(car.color);
		System.out.println(car.price);
	}
}

class Bike extends Vehicle {
	String brand;
	double price;
	
	public Bike() {
		
	}
	
	public Bike(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

class Car extends Vehicle {
	String brand;
	double price;
	
	public Car() {
		
	}
	
	public Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

class BMW extends Bike {
	String model;
	
	public BMW() {
		
	}
	
	public BMW(String model, double price, String color) {
		this.color = color;
		this.price = price;
		this.brand = "BMW";
		this.model = model;
	}
}