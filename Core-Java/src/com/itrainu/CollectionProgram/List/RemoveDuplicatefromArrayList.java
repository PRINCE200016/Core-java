package com.itrainu.CollectionProgram.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatefromArrayList {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add("ram");
		list.add("true");
		list.add(22.3f);
		list.add("ram");
		
		System.out.println(list);
		Set s = new HashSet(list);
		System.out.println(s);

	}

}
