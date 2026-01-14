package varargs;

public class BiggestDoubleElement {

	public static void maxDouble(double... ds) {
		double maxVal = Double.MIN_VALUE;

		for (double d : ds) {
			maxVal = (maxVal > d) ? maxVal : d;
		}

		System.out.println("Max Value: " + maxVal);
	}

	public static void main(String[] args) {
		maxDouble(5.0, 6.5, 7.8);
		maxDouble(5.0, 6.5, 7.8, -9.5);
	}

}
