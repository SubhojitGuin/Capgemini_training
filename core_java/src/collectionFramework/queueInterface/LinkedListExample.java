package collectionFramework.queueInterface;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<>(); // FIFO : Inherits Deque
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.addFirst("D");
		q.addLast("E");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
	
}
