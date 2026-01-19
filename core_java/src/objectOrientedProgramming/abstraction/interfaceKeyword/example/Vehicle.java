package objectOrientedProgramming.abstraction.interfaceKeyword.example;

public interface Vehicle {
	
	void price();
	void type();
	
}

class Bike implements Vehicle {

	@Override
	public void price() {
		System.out.println("Bike price - 200000.0");
	}

	@Override
	public void type() {
		System.out.println("Petrol Bike");
	}
	
}

class Car implements Vehicle {

	@Override
	public void price() {
		System.out.println("Car price - 1000000.0");
	}

	@Override
	public void type() {
		System.out.println("Electric Car");
	}
	
}