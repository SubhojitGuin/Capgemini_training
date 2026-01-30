package dataStructuresAndAlgorithms;

public class GeometricProgression {
	
	public static void main(String[] args) {
		int a = 5;
		int r = 2;
		int n = 6;
		
		long sumOfGP = a * (long)(Math.pow(r, n) - 1) / (r - 1);
		
		System.out.println("Sum of the geometric progression is: " + sumOfGP);
	}

}
