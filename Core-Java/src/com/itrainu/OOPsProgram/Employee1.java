package com.itrainu.OOPsProgram;

public class Employee1 implements Cloneable {

	public String name;
	public Address11 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Employee1 e = (Employee1) super.clone();

		e.address = (Address11) address.clone();

		return e;
	}

	public Employee1(String name) {
		this.name = name;
		this.address = new Address11("Indore");
	}

}

