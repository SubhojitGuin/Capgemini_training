package collectionFramework.programs;

import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator<Integer> li = list.listIterator(); // only for lists and can traverse backwards
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
