package learnObjects;

public class Product {
	int id;
	String name;
	double price;
	float ratings;

	// Constructor Overloading
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product(int id, String name, double price, float ratings) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ratings);
	}

	public static void main(String[] args) {
		Product p1 = new Product(1, "P1");
		p1.display();

		System.out.println();
		Product p2 = new Product(2, "P2", 5.25);
		p2.display();

		System.out.println();
		Product p3 = new Product(3, "P2", 5.25, 4.5f);
		p3.display();

	}
}
