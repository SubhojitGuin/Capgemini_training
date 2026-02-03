package assignments.assignment4;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        CoinChange obj = new CoinChange();

        int[] coins = {9, 6, 5, 1};
        int sum = 19;
//        int[] coins = {4, 6, 2};
//        int sum = 5;
        System.out.println(obj.minCoins(coins, sum));
    }

    private int minCoins(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int coin: coins) {
            for (int pos = coin; pos <= sum; pos++) {
                if (dp[pos - coin] != Integer.MAX_VALUE) {
                    dp[pos] = Math.min(dp[pos], dp[pos - coin] + 1);
                }
            }
        }

        return (dp[sum] == Integer.MAX_VALUE) ? -1 : dp[sum];
    }
}
