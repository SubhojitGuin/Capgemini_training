package heap;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        TopKFrequentElements obj = new TopKFrequentElements();

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        List<Integer> topKElements = obj.getTopKElements(nums, k);
        System.out.println(topKElements);
    }

    private List<Integer> getTopKElements(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

//        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.count - p2.count);
//        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
//            if (pq.size() < k) {
//                pq.offer(new Pair(entry.getKey(), entry.getValue()));
//            } else if (entry.getValue() > pq.peek().count) {
//                pq.poll();
//                pq.offer(new Pair(entry.getKey(), entry.getValue()));
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        while (!pq.isEmpty()) {
//            list.add(pq.poll().num);
//        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> freqMap.get(p1) - freqMap.get(p2));
        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            pq.offer(entry.getKey());
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }


        return list.reversed();
    }

}

class Pair {
    int num;
    int count;

    public Pair(int num, int count) {
        this.num = num;
        this.count = count;
    }
}