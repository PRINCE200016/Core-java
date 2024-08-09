package com.itrainu.CollectionProgram.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class printmiiddleoflist {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(44);
		list.add("prince");
		list.add(88);
		list.add("h");
		list.add("ww");
		
		
		System.out.println(list.get((list.size()-3)));
		
	

	}

}
