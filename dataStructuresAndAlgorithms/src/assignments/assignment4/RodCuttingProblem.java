package assignments.assignment4;

import java.util.Arrays;

public class RodCuttingProblem {


    public static void main(String[] args) {
        RodCuttingProblem obj = new RodCuttingProblem();
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(obj.cutRod(price));
    }

    private int cutRod(int[] price) {
        int[] dp = new int[price.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int length = 1; length <= price.length; length++) {
            for (int i = length; i <= price.length; i++) {
                if (dp[i - length] != -1) {
                    dp[i]  = Math.max(dp[i], dp[i - length] + price[length - 1]);
                }
            }
        }

        return dp[price.length];
    }

}
