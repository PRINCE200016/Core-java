package com.itrainu.StreamApiProgram;

import java.util.Arrays;
import java.util.List;

public class StreamStartWithT {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tkh", "Tkjh", "Ahgvh", "Njgj");

		list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("T")).distinct().sorted().forEach(System.out::println);

	}

}
