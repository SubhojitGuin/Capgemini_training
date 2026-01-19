package objectOrientedProgramming.abstraction.interfaceKeyword.example3;

public class Bus implements Transport {

	@Override
	public void time() {
		System.out.println("Bus: Takes 2 hrs");
	}

	@Override
	public void distance() {
		System.out.println("Bus: 19 km");
	}

	@Override
	public void crowded() {
		System.out.println("Bus: very crowded");
	}

	@Override
	public void comfort() {
		System.out.println("Bus: not comfortable");
	}

}
