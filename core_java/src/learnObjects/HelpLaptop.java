package learnObjects;

public class HelpLaptop {
	
	public static Laptop getLaptop() {
		return new Laptop();
	}
	
	public static Laptop getLaptop(String brand, double price) {
		return new Laptop(brand, price);
	}
	
	public static Laptop getLaptopVerifyingPrice(String brand, double price) {
		if (price < 10000 || price > 500000) {
			System.out.println(brand + " price is not valid");
			return null;
		}
		return new Laptop(brand, price);
	}
	
}
