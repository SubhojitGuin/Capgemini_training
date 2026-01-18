package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program All Pairs of element sum equal to targeted value of an Array ?
 */
public class FindPairsOfElementsWithTargetSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the target value: ");
		int target = sc.nextInt();
		
		sc.close();
		
		System.out.println("The pair of elements are: ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target)
					 System.out.println(arr[i] + " + " + arr[j] + " = " + target);
			}
		}
	}
	
}
