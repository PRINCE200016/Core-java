 package com.itrainu.CollectionProgram.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentTestComparable {
public static void main(String[] args) {

	List<Student> student = new ArrayList<Student>();
	
	student.add(new Student ("Anshul", 10));
	student.add( new Student ("Prince",100));
	student.add( new Student ("Hariom",70));
	student.add( new Student ("Sunny",80));
	
	Collections.sort(student);
	student.forEach(System.out::println);
	
	
	
	

}
}
