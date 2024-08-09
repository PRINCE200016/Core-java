package com.itrainu.CollectionProgram.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listitrator {

	public static void main(String[] args) {
		// to iterate diff data  type we hold the value of obj (list) in List
 List list = new ArrayList();
		list.add(22);
		list.add("prince");
		list.add(1,6);
		list.add("ha");
		
		
		System.out.println(list);
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());

	}

	}
}