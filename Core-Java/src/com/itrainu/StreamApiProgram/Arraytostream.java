package com.itrainu.StreamApiProgram;

import java.util.Arrays;
import java.util.stream.Stream;

public class Arraytostream {

	public static void main(String[] args) {
		String[] str = { "abc", "def", "ghi", "jkl", "mno" };

		Stream<String> stream = Arrays.stream(str);

		stream.sorted().distinct().forEach(System.out::println);

		System.out.println("______");

		Stream<String> stream1 = Arrays.stream(str);

		stream1.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));


	}

}
