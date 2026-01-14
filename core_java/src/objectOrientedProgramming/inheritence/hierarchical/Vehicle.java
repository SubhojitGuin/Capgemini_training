package objectOrientedProgramming.inheritence.hierarchical;

public class Vehicle {
	String color;

	public static void main(String[] args) {
		Bike bike = new Bike("BMW", "black", 50000.0);
		System.out.println(bike.brand);
		System.out.println(bike.color);
		System.out.println(bike.price);
		
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