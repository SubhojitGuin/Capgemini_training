package dataStructuresAndAlgorithms;

public class CountFactors {
	
	public static void main(String[] args) {
		int num = 14;
		
		CountFactors countFactors = new CountFactors();
		System.out.println("No of factors of " + num + " = " + countFactors.getFactorCount(num));
	}
	
	public int getFactorCount(int num) {
		int count = 0;
		
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (i == num/i) count++;
				else count += 2;
			}
		}
		
		return count;
	}

}
