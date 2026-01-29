package collectionFramework.queueInterface;

import java.util.*;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		// Insert
		dq.addFirst(1);
		dq.offerFirst(1); //safe
		dq.offerFirst(4); //safe
		
		dq.addLast(2);
		dq.offerLast(2); //safe
		dq.offerLast(5); //safe
		
		System.out.println(dq);
		
		// Remove
		dq.removeFirst();
		dq.pollFirst();
		dq.removeLast();
		dq.pollLast();
		
		System.out.println(dq);
		
		// View
		System.out.println(dq.getFirst()); 
		System.out.println(dq.peekFirst()); //safe
		System.out.println(dq.getLast());
		System.out.println(dq.peekLast()); //safe
	}
	
}
