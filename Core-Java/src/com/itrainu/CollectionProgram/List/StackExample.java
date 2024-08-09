package com.itrainu.CollectionProgram.List;

import java.util.Stack;

public class StackExample {
// stack first ko last manta hai or last ko first manta hai
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("anshul");
		s.push("aman");
		s.push("anand");
		s.push(2000);
		System.out.println(s.search("anshul"));
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

	}

}
