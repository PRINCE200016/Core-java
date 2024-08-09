package com.itrainu.CollectionProgram.Comparable;

public class Student implements Comparable<Student>{
String name;
int id;
public Student(String name,int id) {
	this.name = name;
	this.id = id;
}
@Override
public int compareTo(Student o) {
	//return this.name.compareTo(o.name);//shorting by name
	//return this.id - o.id;//sorting by ascending order
	//return o.id-this.id;//sorting by descending order
	
	if (this.id !=o.id) {
		return this.name.compareTo(o.name);
		
	}else {
		return this.id - o.id;
	
	
}

}

     public String toString() {
		return (name + "" + id);
    	 
     }
}
 