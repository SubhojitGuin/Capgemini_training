package assignments.assignment3;

public class BubbleSort {

    // Best Complexity - O(n)
    // Average Complexity - O(n^2)
    // Worst Complexity - O(n^2)
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {1, 3, 2, 9, 6, 4, 5};
        obj.sort(arr);
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!swapped) break;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
