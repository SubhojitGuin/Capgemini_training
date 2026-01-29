package collectionFramework.queueInterface;

import java.util.*;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // Min-heap by default
		
		pq.add(20);
		pq.offer(30); //safe
		pq.offer(10);
		
		System.out.println(pq);
		
		pq.remove();
		pq.poll(); //safe
		
		
		System.out.println(pq.element());
		System.out.println(pq.peek()); //safe
	}

}
