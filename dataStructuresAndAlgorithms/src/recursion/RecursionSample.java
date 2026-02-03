package recursion;


public class RecursionSample {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(arr));
//        modfiy(arr);
//        System.out.println(Arrays.toString(arr));

        printNumbers(9);
    }

    private static void printNumbers(int num) {
        if (num == 0) return;

        printNumbers(num - 1); //backtracking
        System.out.print(num + " ");
    }

    private static void modfiy(int[] arr) {
        arr[0] = Integer.MIN_VALUE;
    }

}
