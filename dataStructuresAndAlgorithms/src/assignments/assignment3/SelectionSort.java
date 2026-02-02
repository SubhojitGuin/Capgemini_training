package assignments.assignment3;

public class SelectionSort {

    // Best Complexity - O(n)
    // Average Complexity - O(n^2)
    // Worst Complexity - O(n^2)
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = {1, 3, 2, 9, 6, 4, 5};
        obj.sort(arr);
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
