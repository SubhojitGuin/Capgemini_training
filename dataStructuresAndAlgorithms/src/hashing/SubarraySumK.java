package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;

        SubarraySumK obj = new SubarraySumK();
        System.out.println(obj.subarraySum(nums, k));
    }

    private int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);
        int sum = 0, count = 0;

        for (int num: nums) {
            sum += num;
            count += sumCountMap.getOrDefault(sum - k, 0);
            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

}
