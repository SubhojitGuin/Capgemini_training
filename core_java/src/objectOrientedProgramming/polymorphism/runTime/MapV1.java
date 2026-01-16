package objectOrientedProgramming.polymorphism.runTime;

public class MapV1 {
	
	public void route() {
		System.out.println("Direction to UEM");
	}

	public static void main(String[] args) {
		MapV1 mapV1 = new MapV1();
		mapV1.route();
		
		System.out.println();
		MapV2 mapV2 = new MapV2();
		mapV2.route();
		
		System.out.println();
		MapV3 mapV3 = new MapV3();
		mapV3.route();
		mapV3.bookCab();
		
		System.out.println();
		MapV1 mapV12 = new MapV3(); // Upcasting
		mapV12.route();
		
		System.out.println();
		MapV2 mapV22 = (MapV2) mapV12; // Downcasting to an intermediate child
		mapV22.route();
		
		System.out.println();
		MapV3 mapV32 = (MapV3) mapV12; // Downcasting
		mapV32.route();
		mapV32.bookCab();
	}

}

class MapV2 extends MapV1 {
	
	@Override
	public void route() {
		System.out.println("Direction to IEM");
		System.out.println("Duration - 1 hour");
	}
	
}

class MapV3 extends MapV2 {
	
	public void bookCab() {
		System.out.println("inDrive Cab booked");
	}
	
}