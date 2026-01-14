package learnObjects;

public class Laptop {
	String brand;
	double price;
	
	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void comparePrice(Laptop laptop) {
		if (this.price > laptop.price) { // this refers to the current object
			System.out.println(this.brand + " is more costly");
		} else {
			System.out.println(laptop.brand + " is more costly");
		}
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", 12.35);
		Laptop l2 = new Laptop("Dell", 15.00);
		
		l1.comparePrice(l2);
	}
}
