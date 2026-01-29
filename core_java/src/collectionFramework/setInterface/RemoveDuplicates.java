package collectionFramework.setInterface;

import java.util.*;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(50);
		al.add(10);
		
		System.out.println(al);
		
		HashSet<Integer> set = new HashSet<>(al);
		System.out.println(set);
		
		al.clear();
		al.addAll(set);
		System.out.println(al);
	}

}
