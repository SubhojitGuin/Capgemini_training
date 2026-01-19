package objectOrientedProgramming.abstraction.interfaceKeyword.animals;

public class Lion implements Animal {

	@Override
	public void sound() {
		System.out.println("Lion Roar");
	}

	@Override
	public void color() {
		System.out.println("Lion yellow");
	}

}
