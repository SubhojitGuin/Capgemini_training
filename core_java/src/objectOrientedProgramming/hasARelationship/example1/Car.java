package objectOrientedProgramming.hasARelationship.example1;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine engine;
	
	public Car() {
		
	}
	
	public Car(int id, String color, String brand, Engine engine) {
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.engine = engine;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
