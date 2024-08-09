package com.itrainu.CollectionProgram.FaillFastSafe;

import java.util.Enumeration;
import java.util.Vector;

public class FaillSafe {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement(5);
		v.addElement(20);
		v.addElement("Anshul");
		v.addElement("Arjun");
		
		Enumeration e = v.elements();
		//v.setElementAt(33, 4);
		v.add(5);
		v.remove(0);
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
