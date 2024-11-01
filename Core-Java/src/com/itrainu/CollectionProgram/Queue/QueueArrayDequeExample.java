package com.itrainu.CollectionProgram.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayDequeExample {

	public static void main(String[] args) {
		Queue<Comparable> q = new ArrayDeque<Comparable>();

		q.offer("adf");
		q.offer(4);

		System.out.println(q);


	}

}
 