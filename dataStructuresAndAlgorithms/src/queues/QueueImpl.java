package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove()); // NoSuchElementException

        for (int element: queue) {
            System.out.print(element + " ");
        }

        System.out.println();
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
