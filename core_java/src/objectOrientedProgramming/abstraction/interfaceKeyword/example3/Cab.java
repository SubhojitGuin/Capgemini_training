package objectOrientedProgramming.abstraction.interfaceKeyword.example3;

public class Cab implements Transport {

	@Override
	public void time() {
		System.out.println("Cab: Takes 1 hrs");
	}

	@Override
	public void distance() {
		System.out.println("Cab: 15 km");
	}

	@Override
	public void crowded() {
		System.out.println("Cab: no crowd");
	}
	
	@Override
	public void comfort() {
		System.out.println("Cab: very comfortable");
	}

}
