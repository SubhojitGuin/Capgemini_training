package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSample {

    public static void main(String[] args) {
        /*

        Parent = (i - 1) / 2;
        left child = 2 * i + 1;
        right child = 2 * i + 2;

         */

        PriorityQueue<Integer> queue = new PriorityQueue<>(); // min-heap
        queue.offer(1);
        queue.offer(6);
        queue.offer(8);
        queue.offer(9);
        queue.offer(2);
        queue.offer(0);

        System.out.println(queue);

        for (Integer element: queue) {
            System.out.print(element + " ");
        }

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue);

        // heap sort
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }

        System.out.println(list);
    }

}
