package assignments.assignment3;

public class LinearSearch {

    public int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        System.out.println("Found at index " + obj.search(new int[]{1, 5, 3, 2, 4}, 5));
    }

}
