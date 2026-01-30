package dataStructuresAndAlgorithms;

public class CheckPrime {
	
	public static void main(String[] args) {
		int num = 41;
		
		CheckPrime checkPrime = new CheckPrime();
		
		if (checkPrime.isPrime(num)) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
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
	
	public boolean isPrime(int num) {
		return getFactorCount(num) == 2;
	}

}
