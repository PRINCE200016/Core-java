package com.itrainu.CollectionProgram.Comparator;

public class Employee {
	private String Name;
	private int id;
	private int Salary;
	

	public Employee(String Name, int id, int Salary ) {
		this.Name = Name;
		this.id = id;
		this.Salary = Salary;
	}



	public int getId() {
		return id;
	}

	public int getSalary() {
		return Salary;

	}

	public String getName() {
		return Name;

	}

	public String toString() {
		return (Name +""+id + "" + Salary);

	}

}