package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print Frequency of an occurrence of a given Array
 */
public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int maxElement = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			maxElement = (maxElement > arr[i]) ? maxElement : arr[i];
		}
		
		int[] freqArr = new int[maxElement + 1];
		
		for (int i = 0; i < arr.length; i++) {
			freqArr[arr[i]]++;
		}
		
		System.out.println("The frequency of the elements are: ");
		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] > 0) 
				System.out.println(i + " = " + freqArr[i]);
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
