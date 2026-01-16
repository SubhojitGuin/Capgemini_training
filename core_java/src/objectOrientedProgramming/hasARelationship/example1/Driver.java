package objectOrientedProgramming.hasARelationship.example1;

public class Driver {

	public static void main(String[] args) {
		Engine engine = new Engine(300, "petrol");
		Car car = new Car(1, "black", "BMW", engine);
		
		System.out.println("------------------CAR--------------------");
		System.out.println(car.getId());
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		
		System.out.println("------------------ENGINE--------------------");
		System.out.println(car.getEngine().getCc());
		System.out.println(car.getEngine().getFuelType());
	}
	
}
