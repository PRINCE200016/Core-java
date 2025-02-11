package com.itrainu.StreamApiProgram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEmployeeShortById {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(2, "Anshul"));
		list.add(new Employee(4, "Shyam"));
		list.add(new Employee(3, "Ram"));
		list.add(new Employee(1, "Mohit"));

		list.stream().sorted(Comparator.comparingInt(Employee::getId))
				.forEach(e -> System.out.println(e.getId() + " = " + e.getName()));

	}


	}


