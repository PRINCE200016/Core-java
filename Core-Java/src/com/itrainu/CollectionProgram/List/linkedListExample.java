package com.itrainu.CollectionProgram.List;

import java.util.Iterator;
import java.util.LinkedList;

final class linkedListExample {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("arjun");
		list.add("prince");
		list.add("jeet");
		list.add("hariom");
		
		
		System.out.println(list);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.indexOf("arjun"));
		System.out.println(list.get(3));
		list.set(2, "alok");
		System.out.println(list);
	}

}
