package com.itrainu.CollectionProgram.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(3);
		s.add(1);
		s.add(4);
		s.add(2);

		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			int str = (int) it.next();
			System.out.println(str);
		}
	}

}
