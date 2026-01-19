package objectOrientedProgramming.abstraction.interfaceKeyword.animals;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat meow");
	}

	@Override
	public void color() {
		System.out.println("Cat white");
	}

}
