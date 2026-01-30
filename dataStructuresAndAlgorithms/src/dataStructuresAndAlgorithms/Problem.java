package dataStructuresAndAlgorithms;

public class Problem {

    public int findSum(int[] arr) {
        int sum = 0;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The sum is " + problem.findSum(arr));
    }

}
