package objectOrientedProgramming.polymorphism.compileTime;

public class FindMax {
	
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public int max(int a, int b, int c) {
//		return (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		return max(a, max(b, c));
	}
	
	public float max(int a, float b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		FindMax findMax = new FindMax();
		System.out.println(findMax.max(1,  2));
		System.out.println(findMax.max(1, 2, 3));
		System.out.println(findMax.max(3, 3.5f));
	}

}
