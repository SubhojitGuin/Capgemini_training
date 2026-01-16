package learnArray.OneDArray;

import java.util.Scanner;

public class FindFrequencyOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] freqArr = getFreqArr(arr);
		
		System.out.println("The frequency of elements are:");
		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] > 0) 
				System.out.println(i + " = " + freqArr[i]);
		}
		
		sc.close();
	}

	private static int[] getFreqArr(int[] arr) {
		int maxElement = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			maxElement = (maxElement > arr[i]) ? maxElement : arr[i];
		}
		
		int[] freqArr = new int[maxElement + 1];
		
		for (int i = 0; i < arr.length; i++) {
			freqArr[arr[i]]++;
		}
		
		return freqArr;
	}
}
