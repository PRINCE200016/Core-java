package com.itrainu.StreamApiProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);

		System.out.println("first highest");
		list.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));

		System.out.println("second highest");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
		
		System.out.println("Third highest");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);

	}

	}


