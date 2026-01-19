package objectOrientedProgramming.abstraction.interfaceKeyword.example;

public class Person {

	private Vehicle v; // HAS-A relationship --> interface is used to show loose coupling
	
	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
}
