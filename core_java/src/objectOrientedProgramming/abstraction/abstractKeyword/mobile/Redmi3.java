package objectOrientedProgramming.abstraction.abstractKeyword.mobile;

public class Redmi3 extends Redmi2 {
	
	@Override
	public void smartCamera() {
		System.out.println("Redmi3 smart camera");
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Redmi3();
		mobile.camera();
		mobile.battery();
		
		Redmi2 redmi2 = (Redmi2) mobile;
		redmi2.smartCamera();
	}

}
