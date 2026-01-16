package learnArray.OneDArray;

import java.util.Scanner;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] uniqueArr = getUniqueElements(arr);
		
		System.out.println("The unique elements are:");
		for (int i = 0; i < uniqueArr.length; i++) {
			System.out.print(uniqueArr[i] + " ");
		}
		
		sc.close();
	}
	
	private static int[] getUniqueElements(int[] arr) {
		int maxElement = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			maxElement = (maxElement > arr[i]) ? maxElement : arr[i];
		}
		
		int[] freqArr = new int[maxElement + 1];
		int count = 0;
				
		for (int i = 0; i < arr.length; i++) {
			if (freqArr[arr[i]]++ == 0) count++;
		}
		
		int[] uniqueArr = new int[count];
		
		int k = 0;
		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] > 0) {
				uniqueArr[k++] = i;
			}
		}
		
		return uniqueArr;
	}

}
