package assignments.assignment4;

public class Knapsack01 {

    // Space Complexity - O(N)
    // Time Complexity - O(N^2)
    public static void main(String[] args) {
        Knapsack01 obj = new Knapsack01();
        int[] value = {25, 24, 15};
        int[] weight = {18, 15, 10};
        System.out.println("Total Value: " + obj.getMaxValue(value, weight, value.length, 30));
    }

    private int getMaxValue(int[] value, int[] weight, int size, int capacity) {
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < size; i++) {
            for (int j = dp.length - 1; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }

        return dp[capacity];
    }

}
