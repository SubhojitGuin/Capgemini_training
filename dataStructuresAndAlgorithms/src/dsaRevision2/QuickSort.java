package dsaRevision2;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {40, 60, 45, 80, 100, 65};
        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partitionArray(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partitionArray(int[] arr, int low, int high) {
        int pivot = arr[high];

        int left = low - 1;
        for (int ptr = low; ptr < high; ptr++) {
            if (arr[ptr] < pivot) {
                left++;
                swap(arr, left, ptr);
            }
        }

        left++;
        swap(arr, left, high);
        return left;
    }

    private static void swap(int[] oranges, int ptr1, int ptr2) {
        int temp = oranges[ptr1];
        oranges[ptr1] = oranges[ptr2];
        oranges[ptr2] = temp;
    }

}
