package objectOrientedProgramming.abstraction.interfaceKeyword.animals;

public interface Animal {

	void sound();
	void color();
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		dog.color();
		
		System.out.println();
		Animal lion = new Lion();
		lion.sound();
		lion.color();
		
		System.out.println();
		Animal c = new Cat();
		Cat cat = (Cat) c;
		cat.sound();
		cat.color();
		
//		Dog d = (Dog) c; RTE - ClassCastException
	}

}
