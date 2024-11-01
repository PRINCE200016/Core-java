package com.itrainu.CollectionProgram.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();

		// offer pool peek = addition methods

		q.offer(4);
		q.offer(1);
		q.offer(3);
		q.offerLast(5);
		q.offerFirst(2);

		System.out.println(q);

		// peekLast() get last element
		System.out.println(q.peek() + " get top element");
		System.out.println(q);

		// pollLast() get and remove last element
		System.out.println(q.poll() + " get top element and remove");
		System.out.println(q);

		//q.forEach(System.out::println);

		Iterator<Integer> it = q.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}