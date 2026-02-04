package hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

        int[] arr = {100,4,200,1,3,2};
        int count = obj.getLongestConsecutiveSequence(arr);
        System.out.println(count);
    }

    private int getLongestConsecutiveSequence(int[] arr) {
        Set<Integer> numSet = new HashSet<>();

        for (int num: arr) {
            numSet.add(num);
        }

        int maxCount = 0;
        for (int num: numSet) {
            if (!numSet.contains(num - 1)) {
                int curr = num;
                int count = 0;

                while (numSet.contains(curr)) {
                    count++;
                    curr++;
                }

                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }

}
