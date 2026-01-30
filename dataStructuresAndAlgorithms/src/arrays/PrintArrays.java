package arrays;

import java.util.Arrays;

public class PrintArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[4];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;

        // Printing Array types
        for (int i = 0; i < arr1.length; i++) { // Array traversal using index
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------------------");
        for (int element : arr1) {
            System.out.println(element);
        }
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------------------------------");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }

    }
}
