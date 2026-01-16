package objectOrientedProgramming.inheritence.constructorChaining;

public class Product {
	String brand;
	
	public Product() {
		
	}
	
	public Product(String brand) {
		this.brand = brand;
	}
	
	public void print() {
		System.out.println(this.brand);
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung", 5000.0, "Jio");
//		System.out.println(m.brand);
//		System.out.println(m.price);
//		System.out.println(m.sim);
		m.print();
		
		Laptop l = new Laptop("HP", 50000.0, "AMD");
//		System.out.println(l.brand);
//		System.out.println(l.price);
//		System.out.println(l.processor);
		l.print();
	}
}

class Mobile extends Product {
	double price;
	String sim;
	
	public Mobile() {
		
	}
	
	public Mobile(String brand, double price, String sim) {
		super(brand);
		this.price = price;
		this.sim = sim;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.price);
		System.out.println(this.sim);		
	}
}

class Laptop extends Product {
	double price;
	String processor;
	
	public Laptop() {
		
	}
	
	public Laptop(String brand, double price, String processor) {
		super(brand);
		this.price = price;
		this.processor = processor;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.price);
		System.out.println(this.processor);		
	}
}