package com.itrainu.CollectionProgram.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentpTestComparable {

	public static void main(String[] args) {
		ArrayList<Studentp> student = new ArrayList<Studentp>();
		student.add(new Studentp("arjun","101",90));
		student.add(new Studentp("jeet","102",80));
		student.add(new Studentp("roshni","105",93));
		student.add(new Studentp("ram","109",50));
		Collections.sort(student);
		for(Object obj : student) {
			System.out.println(obj);
		}

	}

}
