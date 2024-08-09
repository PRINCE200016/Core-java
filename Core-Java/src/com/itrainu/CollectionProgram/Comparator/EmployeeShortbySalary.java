package com.itrainu.CollectionProgram.Comparator;

import java.util.Comparator;

public class EmployeeShortbySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary() - o2.getSalary();
		
		//if (o1.getSalary()== o2.getSalary()) {
		//return 0 ;
	//	} else if (o1.getSalary() > o2.getSalary(){
		//	return 0;
	//} else {  
		//return -1
	//}
		//return o1.getSalary()- o2.getSalary();
		}
						
	}

//}
