package com.itrainu.CollectionProgram.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTextComparartor {

	public static void main(String[] args) {
		
	List<Employee> employees = new ArrayList<>();
	employees.add(new Employee("Naman ", 103 , 2000));
	employees.add(new Employee("arjun ", 102 , 4000));
	employees.add(new Employee("Shilpa ", 101 , 1000));
	employees.add(new Employee("Kirti ", 105 , 10000));

	EmployeeShortbyName byName = new EmployeeShortbyName();

	Collections.sort(employees, byName);

	System.out.println("ShortByName>>>");
	employees.forEach(System.out::println);
	// System.out.println(employees);

	System.out.println("________");

	EmployeeShortbySalary bySalary = new EmployeeShortbySalary();

	Collections.sort(employees, bySalary);

	System.out.println("ShortBySalary>>>");
	employees.forEach(System.out::println);
	// System.out.println(employees);

	System.out.println("________");

	EmployeeShortbyId byId = new EmployeeShortbyId();

	Collections.sort(employees, byId);

	System.out.println("ShortById>>>");
	employees.forEach(System.out::println);
	// System.out.println(employees);

	System.out.println("________");

	EmployeeShortbyIdandName byIdOrName = new EmployeeShortbyIdandName();

	Collections.sort(employees, byIdOrName);

	System.out.println("ShortByIdOrName>>>");
	employees.forEach(System.out::println);
	// System.out.println(employees);

	System.out.println("________");

	EmployeeShortbyNameandSalary byNameorSalary = new EmployeeShortbyNameandSalary();

	Collections.sort(employees, byNameorSalary);

	System.out.println("ShortByNameorSalary>>>");
	employees.forEach(System.out::println);
	// System.out.println(employees);
	}

}
