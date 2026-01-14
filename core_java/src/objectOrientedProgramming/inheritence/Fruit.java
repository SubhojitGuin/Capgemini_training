package objectOrientedProgramming.inheritence;

public class Fruit {
	String name;
	String color;
	
	public static void main(String[] args) {
		Apple a = new Apple("Kashmiri Apple", "Red", 240); // child
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.price);
		
		Fruit f = new Fruit();
		f.color = "Green";
		f.name = "Kiwi";
		System.out.println(f.name);
		System.out.println(f.color);
//		System.out.println(f.price); Compile Time Error(CTE)
	}
}

class Apple extends Fruit {
	double price;
	
	public Apple() {
		
	}
	
	public Apple(String name, String color, double price) {
		this.name = name; // inherited
		this.color = color; // inherited
		this.price = price;
	}
}
