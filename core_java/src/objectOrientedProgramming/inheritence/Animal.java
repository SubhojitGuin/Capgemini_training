package objectOrientedProgramming.inheritence;

public class Animal {
	String name;
	String color;
	int noOfLimbs;
	
	void printAnimal() {
		System.out.printf("""
				name: %s
				color: %s
				no of limbs: %s
				""", name, color, noOfLimbs);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Labrador", "Yellow", 4);
		dog.printAnimal();
	}
	
}

class Dog extends Animal {
	 
	public Dog() {
		
	}
	
	public Dog(String name, String color, int noOfLimbs) {
		super();
		this.name = name;
		this.color = color;
		this.noOfLimbs = noOfLimbs;
	}
}
