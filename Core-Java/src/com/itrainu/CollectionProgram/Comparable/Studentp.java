package com.itrainu.CollectionProgram.Comparable;

public class Studentp implements Comparable<Studentp>{
String name ;
String rollno ;
int marks ;
public Studentp (String n,String r,int m) {
	this.name=n;
	this.rollno=r;
	this.marks=m;
}
@Override
public int compareTo(Studentp o) {
	// TODO Auto-generated method stub
	return Integer.compare(this.marks, this.marks);
}

@Override
public String toString() {
	
	return"student{name='"+name+", rollno='"+rollno+ "marks="+marks+"}";
}
}
