package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 5, 6, 8, 7, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key: map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("======================================================");
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("======================================================");
        System.out.println(map);
    }

}
