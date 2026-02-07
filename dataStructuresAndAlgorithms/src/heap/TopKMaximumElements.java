package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKMaximumElements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        TopKMaximumElements obj = new TopKMaximumElements();
        List<Integer> list = obj.topKElements(nums, k);
        System.out.println(list);
    }

    private List<Integer> topKElements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num: nums) {
            pq.offer(num);

            if (pq.size() > k)
                pq.poll();
        }

        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        return list;
    }

}
