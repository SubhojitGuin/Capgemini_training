package recursion;

import java.util.Arrays;

public class Fibonacci {

    public static int iteration(int index) {
        if (index <= 1) return index;

        int n1 = 0, n2 = 1;
        for (int i = 2; i <= index; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n2;
    }

    public static int recursion(int index, int[] dp) {
        if (index <= 1) return index;

        // memoization
        if (dp[index] != -1) return dp[index];
        return dp[index] = recursion(index - 1, dp) + recursion(index - 2, dp);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(iteration(num));

        int[] dp = new int[num + 1];
        Arrays.fill(dp, -1);
        System.out.println(recursion(num, dp));
    }
}
