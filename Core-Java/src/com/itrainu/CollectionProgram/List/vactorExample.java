package com.itrainu.CollectionProgram.List;

import java.util.Iterator;
import java.util.Vector;

public class vactorExample {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("arjun");
		v.addElement("aman");
		v.addElement(200);
		v.addElement(50);

		System.out.println(v);
		System.out.println("_____________________");

		Iterator it = v.iterator(); // add karne k liye enumeration ka use karnrgr

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		System.out.println("________");
		v.setElementAt("anshul", 0);
		System.out.println(v);
	}
}
