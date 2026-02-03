package recursion;

public class PrintArray {

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 4, 6};
        printArray(arr, 0);
    }

}
