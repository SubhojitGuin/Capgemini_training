package objectOrientedProgramming.abstraction.interfaceKeyword.example3;

public class Metro implements Transport {

	@Override
	public void time() {
		System.out.println("Metro: Takes 1.5 hrs");
	}

	@Override
	public void distance() {
		System.out.println("Metro: 21 km");
	}

	@Override
	public void crowded() {
		System.out.println("Metro: crowded");
	}
	
	@Override
	public void comfort() {
		System.out.println("Metro: not comfortable");
	}

}
