package objectOrientedProgramming.abstraction.interfaceKeyword.example;

public class HelpVehicle {
	
	public static Vehicle getVehicle() { // Creates the implementation object for the Vehicle interface
		return new Bike(); // Upcasting
	}
	
}
