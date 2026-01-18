package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print duplicate prime elements of a given Array
 */
public class DuplicatePrimeElements {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int[] freqArr = getFreqArr(arr);
		
		boolean found = false;
		System.out.println("The duplicate prime elements are:");
		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] > 1 && isPrime(i)) {
				found = true;
				System.out.print(i + " ");
			}
		}
		
		if (!found) 
			System.out.println("!None found");
	}
	
	private static boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}
	
	private static int[] getFreqArr(int[] arr) {
		int maxElement = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			maxElement = (maxElement > arr[i]) ? maxElement : arr[i];
		}
		
		int[] freqArr = new int[maxElement + 1];
		
		for (int i = 0; i < arr.length; i++) {
			freqArr[arr[i]]++;
		}
		
		return freqArr;
	}

	public static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		return arr;
	}

}
