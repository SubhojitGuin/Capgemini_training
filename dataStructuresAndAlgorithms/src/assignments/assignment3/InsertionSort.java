package assignments.assignment3;

public class InsertionSort {

    // Best Complexity - O(n)
    // Average Complexity - O(n^2)
    // Worst Complexity - O(n^2)
    // Comparatively better as it does not make all possible comparisons every time
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = {1, 3, 2, 9, 6, 4, 5};
        obj.sort(arr);
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

}
