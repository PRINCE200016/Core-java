package com.itrainu.CollectionProgram.FaillFastSafe;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FaillFast {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(55);
		l.add(12);
		l.add(11);
		l.add(2);
		
		Iterator<Integer> it = l.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			Object obj = (Object) it.next();
			System.out.println(obj + " Dushra");
		}

	}

}
