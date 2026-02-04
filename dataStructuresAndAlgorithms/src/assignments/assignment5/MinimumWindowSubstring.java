package assignments.assignment5;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC", t = "ABC";

        System.out.println(obj.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch: t.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) - 1);
        }

        int nNeg = freqMap.size();
        int minLength = Integer.MAX_VALUE;
        int index = -1;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

            if (freqMap.get(ch) == 0) nNeg--;

            while (left <= right && nNeg == 0) {
                char c = s.charAt(left);
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;
                    index = left;
                }
                freqMap.put(c, freqMap.get(c) - 1);
                if (freqMap.get(c) == -1) nNeg++;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(index, minLength + index);
    }

}
