package learnObjects;

public class Product2 {
	int id;
	String name;
	double price;
	float ratings;

	// Constructor Overloading
	// Constructor Chaining
	public Product2(int id) { // C1
		this.id = id;
	}
	
	public Product2(int id, String name) { // C2
		this(id); // C2 uses C1 to initialize id
		this.name = name;
	}

	public Product2(int id, String name, double price) { // C3
		this(id, name); // C3 uses C2 to initialize id, name
		this.price = price;
	}

	public Product2(int id, String name, double price, float ratings) { // C4
		this(id, name, price); // C4 uses C3 to initialize id, name, price
		this.ratings = ratings;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ratings);
	}

	public static void main(String[] args) {
		Product2 p = new Product2(3, "P2", 5.25, 4.5f);
		p.display();
	}
}
