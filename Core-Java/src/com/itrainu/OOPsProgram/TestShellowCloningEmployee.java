package com.itrainu.OOPsProgram;

public class TestShellowCloningEmployee implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee();

		e.setName("Anshul");
		e.setAddress("Indore");

		Employee e2 = (Employee) e.clone();
//		Employee e2 = (Employee) e;

		e2.setName("Shyam");
		e2.setAddress("Mathura");
//		System.out.println(e);
//		System.out.println(e2);
//		
		Employee e3 = (Employee) e.clone();
//		Employee e3 = (Employee) e;

		e3.setName("Arjun");
		e3.setAddress("Gwalior");
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e3);
		

//		System.out.println(e.getName());
//		System.out.println(e.getAddress());
//		System.out.println(e2.getName());
//		System.out.println(e2.getAddress());

	}

	
}
