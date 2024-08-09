package com.itrainu.CollectionProgram.Comparator;

import java.util.Comparator;

public class EmployeeShortbyId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getId() -  o2.getId();
		// return o2.getId() - o1.getId();
	}

}
