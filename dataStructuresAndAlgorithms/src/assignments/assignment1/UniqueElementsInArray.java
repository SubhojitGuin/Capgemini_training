package assignments.assignment1;

import java.util.ArrayList;
import java.util.List;

/*
Given a sorted array, write a program to remove duplicate elements and print the updated array.
 */
public class UniqueElementsInArray {

    public static void main(String[] args) {
        UniqueElementsInArray obj = new UniqueElementsInArray();
        int[] arr = {1, 1, 1, 3, 3, 3, 3, 4, 5, 5};
        int[] uniqueElements = obj.getUniqueElements(arr);

        for (int ele: uniqueElements) {
            System.out.print(ele + " ");
        }
    }

    private int[] getUniqueElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                newArr[k++] = arr[i];
            }
        }

        return newArr;
    }

}
