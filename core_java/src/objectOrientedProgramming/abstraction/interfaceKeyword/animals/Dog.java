package objectOrientedProgramming.abstraction.interfaceKeyword.animals;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Bark");
	}

	@Override
	public void color() {
		System.out.println("Dog Yellow");
	}

}
