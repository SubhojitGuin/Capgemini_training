package assignments.assignment3;

public class BinarySearch {

    public int search(int[] arr, int num) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == num) return mid;
            else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        System.out.println("Found at index " + obj.search(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
