package learnObjects;

public class Laptop {
	String brand;
	double price;
	
	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Laptop() {
	}

	public void comparePrice(Laptop laptop) {
		if (this.price > laptop.price) { // this refers to the current object
			System.out.println(this.brand + " is more costly");
		} else {
			System.out.println(laptop.brand + " is more costly");
		}
	}
	
	public static void main(String[] args) {
//		Laptop l1 = new Laptop("HP", 12.35);
//		Laptop l2 = new Laptop("Dell", 15.00);
		
//		Laptop l1 = HelpLaptop.getLaptop(); // new keyword is not required for object creation due to helper method
//		l1.brand = "HP";
//		l1.price = 45000.0;
//		
//		Laptop l2 = HelpLaptop.getLaptop();
//		l1.brand = "Dell";
//		l1.price = 50000.0;
		
//		Laptop l1 = HelpLaptop.getLaptop("HP", 45000.0);
//		Laptop l2 = HelpLaptop.getLaptop("Dell", 50000.0);
		
		Laptop l1 = HelpLaptop.getLaptopVerifyingPrice("HP", 45000.0);
		if (l1 == null) {
			return;
		}
		
		Laptop l2 = HelpLaptop.getLaptopVerifyingPrice("Dell", 4500.0);
		if (l2 == null) {
			return;
		}
		
		
		l1.comparePrice(l2);
	}
}
